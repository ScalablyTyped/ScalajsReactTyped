package typingsJapgolly.uuidJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with uuid {
    
    /* CompleteClass */
    override def equals(uuid: uuid): Boolean = js.native
    
    /* CompleteClass */
    override def fromParts(
      timeLow: Any,
      timeMid: Any,
      timeHiAndVersion: Any,
      clockSeqHiAndReserved: Any,
      clockSeqLow: Any,
      node: Any
    ): uuid = js.native
    
    /* CompleteClass */
    override def toBytes(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def toURN(): String = js.native
  }
  @JSImport("uuid-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[uuid]
  inline def create(version: Double): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(version.asInstanceOf[js.Any]).asInstanceOf[uuid]
  
  /* static member */
  inline def firstFromTime(time: Double): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("firstFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[uuid]
  
  /* static member */
  inline def fromBinary(binary: Any): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(binary.asInstanceOf[js.Any]).asInstanceOf[uuid]
  
  /* static member */
  inline def fromBytes(ints: js.Array[Double]): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(ints.asInstanceOf[js.Any]).asInstanceOf[uuid]
  
  /* static member */
  inline def fromTime(time: Double): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTime")(time.asInstanceOf[js.Any]).asInstanceOf[uuid]
  inline def fromTime(time: Double, last: Boolean): uuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTime")(time.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[uuid]
  
  /* static member */
  inline def fromURN(strId: Any): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURN")(strId.asInstanceOf[js.Any]).asInstanceOf[uuid]
  
  /* static member */
  inline def getTimeFieldValues(time: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeFieldValues")(time.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def lastFromTime(time: Any): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("lastFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[uuid]
  
  /* static member */
  @JSImport("uuid-js", "limitUI04")
  @js.native
  def limitUI04: Double = js.native
  inline def limitUI04_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI04")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI06")
  @js.native
  def limitUI06: Double = js.native
  inline def limitUI06_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI06")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI08")
  @js.native
  def limitUI08: Double = js.native
  inline def limitUI08_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI08")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI12")
  @js.native
  def limitUI12: Double = js.native
  inline def limitUI12_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI12")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI14")
  @js.native
  def limitUI14: Double = js.native
  inline def limitUI14_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI14")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI16")
  @js.native
  def limitUI16: Double = js.native
  inline def limitUI16_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI16")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI32")
  @js.native
  def limitUI32: Double = js.native
  inline def limitUI32_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI32")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI40")
  @js.native
  def limitUI40: Double = js.native
  inline def limitUI40_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI40")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uuid-js", "limitUI48")
  @js.native
  def limitUI48: Double = js.native
  inline def limitUI48_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitUI48")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def maxFromBits(bits: Double): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("maxFromBits")(bits.asInstanceOf[js.Any]).asInstanceOf[uuid]
  
  /* static member */
  inline def newTS(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("newTS")().asInstanceOf[uuid]
  
  /* static member */
  inline def paddedString(string: Any, length: Any, z: Any): uuid = (^.asInstanceOf[js.Dynamic].applyDynamic("paddedString")(string.asInstanceOf[js.Any], length.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI04(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI04")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI06(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI06")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI08(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI08")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI12(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI12")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI14(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI14")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI16(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI16")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI32(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI32")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI40(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI40")().asInstanceOf[uuid]
  
  /* static member */
  inline def randomUI48(): uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUI48")().asInstanceOf[uuid]
  
  trait uuid extends StObject {
    
    def equals(uuid: uuid): Boolean
    
    def fromParts(
      timeLow: Any,
      timeMid: Any,
      timeHiAndVersion: Any,
      clockSeqHiAndReserved: Any,
      clockSeqLow: Any,
      node: Any
    ): uuid
    
    def toBytes(): js.Array[Any]
    
    def toURN(): String
  }
  object uuid {
    
    inline def apply(
      equals_ : uuid => Boolean,
      fromParts: (Any, Any, Any, Any, Any, Any) => uuid,
      toBytes: CallbackTo[js.Array[Any]],
      toURN: CallbackTo[String]
    ): uuid = {
      val __obj = js.Dynamic.literal(fromParts = js.Any.fromFunction6(fromParts), toBytes = toBytes.toJsFn, toURN = toURN.toJsFn)
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[uuid]
    }
    
    extension [Self <: uuid](x: Self) {
      
      inline def setEquals_(value: uuid => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setFromParts(value: (Any, Any, Any, Any, Any, Any) => uuid): Self = StObject.set(x, "fromParts", js.Any.fromFunction6(value))
      
      inline def setToBytes(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "toBytes", value.toJsFn)
      
      inline def setToURN(value: CallbackTo[String]): Self = StObject.set(x, "toURN", value.toJsFn)
    }
  }
}
