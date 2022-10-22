package typingsJapgolly.reduxPersistTransformFilter

import typingsJapgolly.reduxPersist.esTypesMod.Transform
import typingsJapgolly.reduxPersistTransformFilter.anon.FilterFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-persist-transform-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State, Raw](reducerName: String): Transform[State, Raw, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def default[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def default[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def default[State, Raw](
    reducerName: String,
    inboundPaths: js.Array[String],
    outboundPaths: js.Array[String],
    transformType: TransformType
  ): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def default[State, Raw](
    reducerName: String,
    inboundPaths: js.Array[String],
    outboundPaths: Unit,
    transformType: TransformType
  ): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def default[State, Raw](reducerName: String, inboundPaths: Unit, outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def default[State, Raw](
    reducerName: String,
    inboundPaths: Unit,
    outboundPaths: js.Array[String],
    transformType: TransformType
  ): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def default[State, Raw](reducerName: String, inboundPaths: Unit, outboundPaths: Unit, transformType: TransformType): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  
  inline def createBlacklistFilter[State, Raw](reducerName: String): Transform[State, Raw, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlacklistFilter")(reducerName.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createBlacklistFilter[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlacklistFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createBlacklistFilter[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlacklistFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createBlacklistFilter[State, Raw](reducerName: String, inboundPaths: Unit, outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlacklistFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  
  inline def createFilter[State, Raw](reducerName: String): Transform[State, Raw, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createFilter[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createFilter[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createFilter[State, Raw](
    reducerName: String,
    inboundPaths: js.Array[String],
    outboundPaths: js.Array[String],
    transformType: TransformType
  ): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createFilter[State, Raw](
    reducerName: String,
    inboundPaths: js.Array[String],
    outboundPaths: Unit,
    transformType: TransformType
  ): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createFilter[State, Raw](reducerName: String, inboundPaths: Unit, outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createFilter[State, Raw](
    reducerName: String,
    inboundPaths: Unit,
    outboundPaths: js.Array[String],
    transformType: TransformType
  ): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createFilter[State, Raw](reducerName: String, inboundPaths: Unit, outboundPaths: Unit, transformType: TransformType): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  
  inline def createWhitelistFilter[State, Raw](reducerName: String): Transform[State, Raw, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWhitelistFilter")(reducerName.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createWhitelistFilter[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWhitelistFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createWhitelistFilter[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWhitelistFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  inline def createWhitelistFilter[State, Raw](reducerName: String, inboundPaths: Unit, outboundPaths: js.Array[String]): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWhitelistFilter")(reducerName.asInstanceOf[js.Any], inboundPaths.asInstanceOf[js.Any], outboundPaths.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  
  inline def persistFilter[State, Raw](state: State, paths: js.Array[FilterFunction | String], transformType: TransformType): Transform[State, Raw, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistFilter")(state.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[Transform[State, Raw, Any, Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reduxPersistTransformFilter.reduxPersistTransformFilterStrings.whitelist
    - typingsJapgolly.reduxPersistTransformFilter.reduxPersistTransformFilterStrings.blacklist
  */
  trait TransformType extends StObject
  object TransformType {
    
    inline def blacklist: typingsJapgolly.reduxPersistTransformFilter.reduxPersistTransformFilterStrings.blacklist = "blacklist".asInstanceOf[typingsJapgolly.reduxPersistTransformFilter.reduxPersistTransformFilterStrings.blacklist]
    
    inline def whitelist: typingsJapgolly.reduxPersistTransformFilter.reduxPersistTransformFilterStrings.whitelist = "whitelist".asInstanceOf[typingsJapgolly.reduxPersistTransformFilter.reduxPersistTransformFilterStrings.whitelist]
  }
}
