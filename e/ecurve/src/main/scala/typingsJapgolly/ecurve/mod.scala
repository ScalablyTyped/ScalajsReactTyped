package typingsJapgolly.ecurve

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecurve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecurve", "Curve")
  @js.native
  open class Curve protected () extends StObject {
    def this(
      p: typingsJapgolly.bigi.mod.^,
      a: typingsJapgolly.bigi.mod.^,
      b: typingsJapgolly.bigi.mod.^,
      Gx: typingsJapgolly.bigi.mod.^,
      Gy: typingsJapgolly.bigi.mod.^,
      n: typingsJapgolly.bigi.mod.^,
      h: typingsJapgolly.bigi.mod.^
    ) = this()
    
    var G: Point = js.native
    
    var a: typingsJapgolly.bigi.mod.^ = js.native
    
    var b: typingsJapgolly.bigi.mod.^ = js.native
    
    var h: typingsJapgolly.bigi.mod.^ = js.native
    
    def isInfinity(Q: Any): Boolean = js.native
    
    def isOnCurve(Q: Any): Boolean = js.native
    
    var n: typingsJapgolly.bigi.mod.^ = js.native
    
    var p: typingsJapgolly.bigi.mod.^ = js.native
    
    def pointFromX(isOdd: Boolean, x: Point): Point = js.native
    
    def validate(Q: Any): Boolean = js.native
  }
  
  @JSImport("ecurve", "Point")
  @js.native
  open class Point protected () extends StObject {
    def this(
      curve: Curve,
      x: typingsJapgolly.bigi.mod.^,
      y: typingsJapgolly.bigi.mod.^,
      z: typingsJapgolly.bigi.mod.^
    ) = this()
    
    def add(b: Point): Point = js.native
    
    var affineX: typingsJapgolly.bigi.mod.^ = js.native
    
    var affineY: typingsJapgolly.bigi.mod.^ = js.native
    
    def equals(other: Point): Boolean = js.native
    
    def getEncoded(): Buffer = js.native
    def getEncoded(compressed: Boolean): Buffer = js.native
    
    def multiply(k: Any): Point = js.native
    
    def multiplyTwo(j: Any, x: Any, k: Any): Point = js.native
    
    def negate(): Point = js.native
    
    def twice(): Point = js.native
    
    var x: typingsJapgolly.bigi.mod.^ = js.native
    
    var y: typingsJapgolly.bigi.mod.^ = js.native
    
    var z: typingsJapgolly.bigi.mod.^ = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("ecurve", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeFrom(curve: Curve, buffer: Buffer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFrom")(curve.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fromAffine(curve: Curve, x: typingsJapgolly.bigi.mod.^, y: typingsJapgolly.bigi.mod.^): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAffine")(curve.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
  
  inline def getCurveByName(name: String): Curve = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurveByName")(name.asInstanceOf[js.Any]).asInstanceOf[Curve]
}
