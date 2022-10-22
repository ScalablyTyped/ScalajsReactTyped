package typingsJapgolly.tensorflowTfjsCore.mod

import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serialization {
  
  @JSImport("@tensorflow/tfjs-core", "serialization")
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-core", "serialization.Serializable")
  @js.native
  open class Serializable ()
    extends typingsJapgolly.tensorflowTfjsCore.distBaseMod.serialization.Serializable
  /* static members */
  object Serializable {
    
    @JSImport("@tensorflow/tfjs-core", "serialization.Serializable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of T from a ConfigDict.
      *
      * This works for most descendants of serializable.  A few need to
      * provide special handling.
      * @param cls A Constructor for the class to instantiate.
      * @param config The Configuration for the object.
      */
    /** @nocollapse */
    inline def fromConfig[T /* <: typingsJapgolly.tensorflowTfjsCore.distSerializationMod.Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@tensorflow/tfjs-core", "serialization.SerializationMap")
  @js.native
  /* private */ open class SerializationMap ()
    extends typingsJapgolly.tensorflowTfjsCore.distBaseMod.serialization.SerializationMap
  /* static members */
  object SerializationMap {
    
    @JSImport("@tensorflow/tfjs-core", "serialization.SerializationMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the singleton instance of the map.
      */
    inline def getMap(): typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializationMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getMap")().asInstanceOf[typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializationMap]
    
    @JSImport("@tensorflow/tfjs-core", "serialization.SerializationMap.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    /**
      * Registers the class as serializable.
      */
    inline def register[T /* <: typingsJapgolly.tensorflowTfjsCore.distSerializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def registerClass[T /* <: typingsJapgolly.tensorflowTfjsCore.distSerializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
