public class Cercle {
    private float x;
    private float y;
    
    //constructor por defecto
    public Cercle(){
      x=0;
      y=0;
    }
    
    //constructor por parámetros
    public Cercle(float xx, float yy)
    {
        x=xx;
        y=yy;
    }
    
    //constructor copiador
    public Cercle(Cercle cer){
        x=cer.x;
        y=cer.y;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cercle other = (Cercle) obj;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
            return false;
        }
        return true;
    }
    
    
}
