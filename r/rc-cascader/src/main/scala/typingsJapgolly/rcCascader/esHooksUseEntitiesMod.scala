package typingsJapgolly.rcCascader

import typingsJapgolly.rcCascader.esCascaderMod.DefaultOptionType
import typingsJapgolly.rcCascader.esCascaderMod.InternalFieldNames
import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseEntitiesMod {
  
  @JSImport("rc-cascader/es/hooks/useEntities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Lazy parse options data into conduct-able info to avoid perf issue in single mode */
  inline def default(options: js.Array[DefaultOptionType], fieldNames: InternalFieldNames): GetEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[GetEntities]
  
  type GetEntities = js.Function0[Record[String, DataEntity[DataNode]]]
  
  trait OptionsInfo extends StObject {
    
    var keyEntities: Record[String, DataEntity[DataNode]]
    
    var pathKeyEntities: Record[String, DataEntity[DataNode]]
  }
  object OptionsInfo {
    
    inline def apply(
      keyEntities: Record[String, DataEntity[DataNode]],
      pathKeyEntities: Record[String, DataEntity[DataNode]]
    ): OptionsInfo = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], pathKeyEntities = pathKeyEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsInfo]
    }
    
    extension [Self <: OptionsInfo](x: Self) {
      
      inline def setKeyEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setPathKeyEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "pathKeyEntities", value.asInstanceOf[js.Any])
    }
  }
}
