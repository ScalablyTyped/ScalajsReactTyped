package typingsJapgolly.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.anon.Filters
import typingsJapgolly.relayRuntime.anon.Key
import typingsJapgolly.relayRuntime.anon.OptimisticUpdater
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.relayRuntimeStrings.NODE_DELETE
import typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_ADD
import typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_DELETE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutationsRelayDeclarativeMutationConfigMod {
  
  @JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(configs: js.Array[DeclarativeMutationConfig], request: ConcreteRequest): OptimisticUpdater = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(configs.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[OptimisticUpdater]
  inline def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: Unit,
    updater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(configs.asInstanceOf[js.Any], request.asInstanceOf[js.Any], optimisticUpdater.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[OptimisticUpdater]
  inline def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(configs.asInstanceOf[js.Any], request.asInstanceOf[js.Any], optimisticUpdater.asInstanceOf[js.Any])).asInstanceOf[OptimisticUpdater]
  inline def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object],
    updater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(configs.asInstanceOf[js.Any], request.asInstanceOf[js.Any], optimisticUpdater.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[OptimisticUpdater]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeAddConfig
    - typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeDeleteConfig
    - typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.NodeDeleteConfig
  */
  trait DeclarativeMutationConfig extends StObject
  object DeclarativeMutationConfig {
    
    inline def NodeDeleteConfig(deletedIDFieldName: String): typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.NodeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NODE_DELETE")
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.NodeDeleteConfig]
    }
    
    inline def RangeAddConfig(edgeName: String): typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeAddConfig = {
      val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("RANGE_ADD")
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeAddConfig]
    }
    
    inline def RangeDeleteConfig(deletedIDFieldName: String | js.Array[String], pathToConnection: js.Array[String]): typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("RANGE_DELETE")
      __obj.asInstanceOf[typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeDeleteConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_ADD
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_DELETE
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.NODE_DELETE
  */
  trait MutationTypes extends StObject
  object MutationTypes {
    
    inline def NODE_DELETE: typingsJapgolly.relayRuntime.relayRuntimeStrings.NODE_DELETE = "NODE_DELETE".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.NODE_DELETE]
    
    inline def RANGE_ADD: typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_ADD = "RANGE_ADD".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_ADD]
    
    inline def RANGE_DELETE: typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_DELETE = "RANGE_DELETE".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.RANGE_DELETE]
  }
  
  trait NodeDeleteConfig
    extends StObject
       with DeclarativeMutationConfig {
    
    var connectionName: js.UndefOr[String] = js.undefined
    
    var deletedIDFieldName: String
    
    var parentID: js.UndefOr[String] = js.undefined
    
    var parentName: js.UndefOr[String] = js.undefined
    
    var `type`: NODE_DELETE
  }
  object NodeDeleteConfig {
    
    inline def apply(deletedIDFieldName: String): NodeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NODE_DELETE")
      __obj.asInstanceOf[NodeDeleteConfig]
    }
    
    extension [Self <: NodeDeleteConfig](x: Self) {
      
      inline def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      inline def setDeletedIDFieldName(value: String): Self = StObject.set(x, "deletedIDFieldName", value.asInstanceOf[js.Any])
      
      inline def setParentID(value: String): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
      
      inline def setParentIDUndefined: Self = StObject.set(x, "parentID", js.undefined)
      
      inline def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
      
      inline def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
      
      inline def setType(value: NODE_DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeAddConfig
    extends StObject
       with DeclarativeMutationConfig {
    
    var connectionInfo: js.UndefOr[js.Array[Filters]] = js.undefined
    
    var connectionName: js.UndefOr[String] = js.undefined
    
    var edgeName: String
    
    var parentID: js.UndefOr[String] = js.undefined
    
    var parentName: js.UndefOr[String] = js.undefined
    
    var rangeBehaviors: js.UndefOr[RangeBehaviors] = js.undefined
    
    var `type`: RANGE_ADD
  }
  object RangeAddConfig {
    
    inline def apply(edgeName: String): RangeAddConfig = {
      val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("RANGE_ADD")
      __obj.asInstanceOf[RangeAddConfig]
    }
    
    extension [Self <: RangeAddConfig](x: Self) {
      
      inline def setConnectionInfo(value: js.Array[Filters]): Self = StObject.set(x, "connectionInfo", value.asInstanceOf[js.Any])
      
      inline def setConnectionInfoUndefined: Self = StObject.set(x, "connectionInfo", js.undefined)
      
      inline def setConnectionInfoVarargs(value: Filters*): Self = StObject.set(x, "connectionInfo", js.Array(value*))
      
      inline def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      inline def setEdgeName(value: String): Self = StObject.set(x, "edgeName", value.asInstanceOf[js.Any])
      
      inline def setParentID(value: String): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
      
      inline def setParentIDUndefined: Self = StObject.set(x, "parentID", js.undefined)
      
      inline def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
      
      inline def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
      
      inline def setRangeBehaviors(value: RangeBehaviors): Self = StObject.set(x, "rangeBehaviors", value.asInstanceOf[js.Any])
      
      inline def setRangeBehaviorsFunction1(value: /* connectionArgs */ StringDictionary[Any] => RangeOperations): Self = StObject.set(x, "rangeBehaviors", js.Any.fromFunction1(value))
      
      inline def setRangeBehaviorsUndefined: Self = StObject.set(x, "rangeBehaviors", js.undefined)
      
      inline def setType(value: RANGE_ADD): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RangeBehaviors = RangeBehaviorsFunction | RangeBehaviorsObject
  
  type RangeBehaviorsFunction = js.Function1[/* connectionArgs */ StringDictionary[Any], RangeOperations]
  
  type RangeBehaviorsObject = StringDictionary[RangeOperations]
  
  trait RangeDeleteConfig
    extends StObject
       with DeclarativeMutationConfig {
    
    var connectionKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var connectionName: js.UndefOr[String] = js.undefined
    
    var deletedIDFieldName: String | js.Array[String]
    
    var parentID: js.UndefOr[String] = js.undefined
    
    var parentName: js.UndefOr[String] = js.undefined
    
    var pathToConnection: js.Array[String]
    
    var `type`: RANGE_DELETE
  }
  object RangeDeleteConfig {
    
    inline def apply(deletedIDFieldName: String | js.Array[String], pathToConnection: js.Array[String]): RangeDeleteConfig = {
      val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("RANGE_DELETE")
      __obj.asInstanceOf[RangeDeleteConfig]
    }
    
    extension [Self <: RangeDeleteConfig](x: Self) {
      
      inline def setConnectionKeys(value: js.Array[Key]): Self = StObject.set(x, "connectionKeys", value.asInstanceOf[js.Any])
      
      inline def setConnectionKeysUndefined: Self = StObject.set(x, "connectionKeys", js.undefined)
      
      inline def setConnectionKeysVarargs(value: Key*): Self = StObject.set(x, "connectionKeys", js.Array(value*))
      
      inline def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      inline def setDeletedIDFieldName(value: String | js.Array[String]): Self = StObject.set(x, "deletedIDFieldName", value.asInstanceOf[js.Any])
      
      inline def setDeletedIDFieldNameVarargs(value: String*): Self = StObject.set(x, "deletedIDFieldName", js.Array(value*))
      
      inline def setParentID(value: String): Self = StObject.set(x, "parentID", value.asInstanceOf[js.Any])
      
      inline def setParentIDUndefined: Self = StObject.set(x, "parentID", js.undefined)
      
      inline def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
      
      inline def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
      
      inline def setPathToConnection(value: js.Array[String]): Self = StObject.set(x, "pathToConnection", value.asInstanceOf[js.Any])
      
      inline def setPathToConnectionVarargs(value: String*): Self = StObject.set(x, "pathToConnection", js.Array(value*))
      
      inline def setType(value: RANGE_DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.append
    - typingsJapgolly.relayRuntime.relayRuntimeStrings.prepend
  */
  trait RangeOperations extends StObject
  object RangeOperations {
    
    inline def append: typingsJapgolly.relayRuntime.relayRuntimeStrings.append = "append".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.append]
    
    inline def prepend: typingsJapgolly.relayRuntime.relayRuntimeStrings.prepend = "prepend".asInstanceOf[typingsJapgolly.relayRuntime.relayRuntimeStrings.prepend]
  }
}
