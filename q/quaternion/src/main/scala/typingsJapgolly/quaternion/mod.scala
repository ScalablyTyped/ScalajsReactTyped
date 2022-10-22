package typingsJapgolly.quaternion

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.quaternion.anon.Pitch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("quaternion", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with typingsJapgolly.quaternion.mod.Quaternion {
    def this(quaternion: String) = this()
    def this(quaternion: AnyQuaternionArray) = this()
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def this(quaternion: QuaternionComplexRecord) = this()
    def this(quaternion: QuaternionRecord) = this()
    def this(w: Double) = this()
    def this(w: Double, x: Double) = this()
    def this(w: Unit, x: Double) = this()
    def this(w: Double, x: Double, y: Double) = this()
    def this(w: Double, x: Unit, y: Double) = this()
    def this(w: Unit, x: Double, y: Double) = this()
    def this(w: Unit, x: Unit, y: Double) = this()
    def this(w: Double, x: Double, y: Double, z: Double) = this()
    def this(w: Double, x: Double, y: Unit, z: Double) = this()
    def this(w: Double, x: Unit, y: Double, z: Double) = this()
    def this(w: Double, x: Unit, y: Unit, z: Double) = this()
    def this(w: Unit, x: Double, y: Double, z: Double) = this()
    def this(w: Unit, x: Double, y: Unit, z: Double) = this()
    def this(w: Unit, x: Unit, y: Double, z: Double) = this()
    def this(w: Unit, x: Unit, y: Unit, z: Double) = this()
  }
  @JSImport("quaternion", JSImport.Namespace)
  @js.native
  val ^ : typingsJapgolly.quaternion.mod.Quaternion = js.native
  
  @JSImport("quaternion", "EPSILON")
  @js.native
  val EPSILON: Double = js.native
  
  @JSImport("quaternion", "I")
  @js.native
  val I: typingsJapgolly.quaternion.mod.Quaternion = js.native
  
  @JSImport("quaternion", "J")
  @js.native
  val J: typingsJapgolly.quaternion.mod.Quaternion = js.native
  
  @JSImport("quaternion", "K")
  @js.native
  val K: typingsJapgolly.quaternion.mod.Quaternion = js.native
  
  @JSImport("quaternion", "ONE")
  @js.native
  val ONE: typingsJapgolly.quaternion.mod.Quaternion = js.native
  
  @js.native
  trait Quaternion extends StObject {
    
    def add(quaternion: String): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(quaternion: AnyQuaternionArray): typingsJapgolly.quaternion.mod.Quaternion = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def add(quaternion: QuaternionComplexRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(quaternion: QuaternionRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double, x: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double, x: Double, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double, x: Double, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double, x: Double, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double, x: Unit, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double, x: Unit, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def add(w: Double, x: Unit, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def conjugate(): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def div(quaternion: String): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(quaternion: AnyQuaternionArray): typingsJapgolly.quaternion.mod.Quaternion = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def div(quaternion: QuaternionComplexRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(quaternion: QuaternionRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double, x: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double, x: Double, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double, x: Double, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double, x: Double, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double, x: Unit, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double, x: Unit, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def div(w: Double, x: Unit, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def dot(quaternion: String): Double = js.native
    def dot(quaternion: AnyQuaternionArray): Double = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def dot(quaternion: QuaternionComplexRecord): Double = js.native
    def dot(quaternion: QuaternionRecord): Double = js.native
    def dot(w: Double): Double = js.native
    def dot(w: Double, x: Double): Double = js.native
    def dot(w: Double, x: Double, y: Double): Double = js.native
    def dot(w: Double, x: Double, y: Double, z: Double): Double = js.native
    def dot(w: Double, x: Double, y: Unit, z: Double): Double = js.native
    def dot(w: Double, x: Unit, y: Double): Double = js.native
    def dot(w: Double, x: Unit, y: Double, z: Double): Double = js.native
    def dot(w: Double, x: Unit, y: Unit, z: Double): Double = js.native
    
    def equals(quaternion: String): Boolean = js.native
    def equals(quaternion: AnyQuaternionArray): Boolean = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord  and QuaternionComplexRecord fields
    def equals(quaternion: QuaternionComplexRecord): Boolean = js.native
    def equals(quaternion: QuaternionRecord): Boolean = js.native
    def equals(w: Double): Boolean = js.native
    def equals(w: Double, x: Double): Boolean = js.native
    def equals(w: Double, x: Double, y: Double): Boolean = js.native
    def equals(w: Double, x: Double, y: Double, z: Double): Boolean = js.native
    def equals(w: Double, x: Double, y: Unit, z: Double): Boolean = js.native
    def equals(w: Double, x: Unit, y: Double): Boolean = js.native
    def equals(w: Double, x: Unit, y: Double, z: Double): Boolean = js.native
    def equals(w: Double, x: Unit, y: Unit, z: Double): Boolean = js.native
    
    def exp(): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def imag(): js.Tuple3[Double, Double, Double] = js.native
    
    def inverse(): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def isFinite(): Boolean = js.native
    
    def isNaN(): Boolean = js.native
    
    def log(): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def mul(quaternion: String): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(quaternion: AnyQuaternionArray): typingsJapgolly.quaternion.mod.Quaternion = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def mul(quaternion: QuaternionComplexRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(quaternion: QuaternionRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double, x: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double, x: Double, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double, x: Double, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double, x: Double, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double, x: Unit, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double, x: Unit, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def mul(w: Double, x: Unit, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def neg(): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def norm(): Double = js.native
    
    def normSq(): Double = js.native
    
    def normalize(): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def pow(quaternion: String): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(quaternion: AnyQuaternionArray): typingsJapgolly.quaternion.mod.Quaternion = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def pow(quaternion: QuaternionComplexRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(quaternion: QuaternionRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double, x: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double, x: Double, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double, x: Double, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double, x: Double, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double, x: Unit, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double, x: Unit, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def pow(w: Double, x: Unit, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def real(): Double = js.native
    
    def rotateVector(v: js.Tuple3[Double, Double, Double]): js.Tuple3[Double, Double, Double] = js.native
    
    def scale(s: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def slerp(quaternion: String): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(quaternion: AnyQuaternionArray): js.Function1[/* pct */ Double, this.type] = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def slerp(quaternion: QuaternionComplexRecord): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(quaternion: QuaternionRecord): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double, x: Double): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double, x: Double, y: Double): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double, x: Double, y: Double, z: Double): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double, x: Double, y: Unit, z: Double): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double, x: Unit, y: Double): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double, x: Unit, y: Double, z: Double): js.Function1[/* pct */ Double, this.type] = js.native
    def slerp(w: Double, x: Unit, y: Unit, z: Double): js.Function1[/* pct */ Double, this.type] = js.native
    
    def sub(quaternion: String): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(quaternion: AnyQuaternionArray): typingsJapgolly.quaternion.mod.Quaternion = js.native
    // tslint:disable-next-line:unified-signatures Avoid union of QuaternionRecord and QuaternionComplexRecord fields
    def sub(quaternion: QuaternionComplexRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(quaternion: QuaternionRecord): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double, x: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double, x: Double, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double, x: Double, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double, x: Double, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double, x: Unit, y: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double, x: Unit, y: Double, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    def sub(w: Double, x: Unit, y: Unit, z: Double): typingsJapgolly.quaternion.mod.Quaternion = js.native
    
    def toEuler(): Pitch = js.native
    
    def toMatrix[T /* <: Boolean */](twoD: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? quaternion.quaternion.Matrix3_2D : quaternion.quaternion.Matrix3 */ js.Any = js.native
    
    def toMatrix4[T /* <: Boolean */](twoD: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? quaternion.quaternion.Matrix4_2D : quaternion.quaternion.Matrix4 */ js.Any = js.native
    
    def toVector(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  @JSImport("quaternion", "Quaternion")
  @js.native
  val Quaternion: typingsJapgolly.quaternion.mod.Quaternion = js.native
  
  @JSImport("quaternion", "ZERO")
  @js.native
  val ZERO: typingsJapgolly.quaternion.mod.Quaternion = js.native
  
  inline def fromAxisAngle(axis: js.Tuple3[Double, Double, Double], angle: Double): typingsJapgolly.quaternion.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxisAngle")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.quaternion.mod.Quaternion]
  
  inline def fromBetweenVectors(u: js.Tuple3[Double, Double, Double], v: js.Tuple3[Double, Double, Double]): typingsJapgolly.quaternion.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBetweenVectors")(u.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.quaternion.mod.Quaternion]
  
  inline def fromEuler(phi: Double, theta: Double, psi: Double): typingsJapgolly.quaternion.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEuler")(phi.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], psi.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.quaternion.mod.Quaternion]
  inline def fromEuler(phi: Double, theta: Double, psi: Double, order: String): typingsJapgolly.quaternion.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEuler")(phi.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], psi.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.quaternion.mod.Quaternion]
  
  inline def random(): typingsJapgolly.quaternion.mod.Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typingsJapgolly.quaternion.mod.Quaternion]
  
  type AnyQuaternionArray = QuaternionArray | QuaternionAugmentedArray
  
  type Matrix3 = js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]
  
  type Matrix32D = js.Tuple3[
    js.Tuple3[Double, Double, Double], 
    js.Tuple3[Double, Double, Double], 
    js.Tuple3[Double, Double, Double]
  ]
  
  type Matrix4 = js.Tuple16[
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  type Matrix42D = js.Tuple4[
    js.Tuple4[Double, Double, Double, Double], 
    js.Tuple4[Double, Double, Double, Double], 
    js.Tuple4[Double, Double, Double, Double], 
    js.Tuple4[Double, Double, Double, Double]
  ]
  
  type QuaternionArray = js.Tuple4[Double, Double, Double, Double]
  
  type QuaternionAugmentedArray = js.Tuple3[Double, Double, Double]
  
  trait QuaternionComplexRecord extends StObject {
    
    var im: Double
    
    var re: Double
  }
  object QuaternionComplexRecord {
    
    inline def apply(im: Double, re: Double): QuaternionComplexRecord = {
      val __obj = js.Dynamic.literal(im = im.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuaternionComplexRecord]
    }
    
    extension [Self <: QuaternionComplexRecord](x: Self) {
      
      inline def setIm(value: Double): Self = StObject.set(x, "im", value.asInstanceOf[js.Any])
      
      inline def setRe(value: Double): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.quaternion.anon.wnumberwnumberundefinedxn
    - typingsJapgolly.quaternion.anon.xnumberwnumberundefinedxn
    - typingsJapgolly.quaternion.anon.ynumberwnumberundefinedxn
    - typingsJapgolly.quaternion.anon.znumberwnumberundefinedxn
  */
  trait QuaternionRecord extends StObject
  object QuaternionRecord {
    
    inline def wnumberwnumberundefinedxn(w: Double & js.UndefOr[Double]): typingsJapgolly.quaternion.anon.wnumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.quaternion.anon.wnumberwnumberundefinedxn]
    }
    
    inline def xnumberwnumberundefinedxn(x: Double & js.UndefOr[Double]): typingsJapgolly.quaternion.anon.xnumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.quaternion.anon.xnumberwnumberundefinedxn]
    }
    
    inline def ynumberwnumberundefinedxn(y: Double & js.UndefOr[Double]): typingsJapgolly.quaternion.anon.ynumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.quaternion.anon.ynumberwnumberundefinedxn]
    }
    
    inline def znumberwnumberundefinedxn(z: Double & js.UndefOr[Double]): typingsJapgolly.quaternion.anon.znumberwnumberundefinedxn = {
      val __obj = js.Dynamic.literal(z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.quaternion.anon.znumberwnumberundefinedxn]
    }
  }
  
  type _To = typingsJapgolly.quaternion.mod.Quaternion
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typingsJapgolly.quaternion.mod.Quaternion = ^
}
