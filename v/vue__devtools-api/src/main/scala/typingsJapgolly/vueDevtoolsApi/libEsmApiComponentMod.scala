package typingsJapgolly.vueDevtoolsApi

import typingsJapgolly.vueDevtoolsApi.anon.Actions
import typingsJapgolly.vueDevtoolsApi.anon.Mode
import typingsJapgolly.vueDevtoolsApi.libEsmApiApiMod.InspectorNodeTag
import typingsJapgolly.vueDevtoolsApi.libEsmApiUtilMod.ID
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.computed
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.other
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.reactive
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmApiComponentMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.function
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.map
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.set
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.reference
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.component
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.`component-definition`
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.router
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.store
  */
  trait ComponentBuiltinCustomStateTypes extends StObject
  object ComponentBuiltinCustomStateTypes {
    
    inline def component: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.component = "component".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.component]
    
    inline def `component-definition`: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.`component-definition` = "component-definition".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.`component-definition`]
    
    inline def function: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.function = "function".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.function]
    
    inline def map: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.map = "map".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.map]
    
    inline def reference: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.reference = "reference".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.reference]
    
    inline def router: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.router = "router".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.router]
    
    inline def set: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.set = "set".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.set]
    
    inline def store: typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.store = "store".asInstanceOf[typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.store]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentState because Already inherited */ trait ComponentCustomState
    extends StObject
       with ComponentStateBase {
    
    @JSName("value")
    var value_ComponentCustomState: CustomState
  }
  object ComponentCustomState {
    
    inline def apply(key: String, `type`: String, value: CustomState): ComponentCustomState = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentCustomState]
    }
    
    extension [Self <: ComponentCustomState](x: Self) {
      
      inline def setValue(value: CustomState): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentDevtoolsOptions extends StObject {
    
    var hide: js.UndefOr[Boolean] = js.undefined
  }
  object ComponentDevtoolsOptions {
    
    inline def apply(): ComponentDevtoolsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentDevtoolsOptions]
    }
    
    extension [Self <: ComponentDevtoolsOptions](x: Self) {
      
      inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    }
  }
  
  type ComponentInstance = Any
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentState because Already inherited */ trait ComponentPropState
    extends StObject
       with ComponentStateBase {
    
    var meta: js.UndefOr[Mode] = js.undefined
  }
  object ComponentPropState {
    
    inline def apply(key: String, `type`: String, value: Any): ComponentPropState = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentPropState]
    }
    
    extension [Self <: ComponentPropState](x: Self) {
      
      inline def setMeta(value: Mode): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentStateBase
    - typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentPropState
    - typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentCustomState
  */
  trait ComponentState extends StObject
  object ComponentState {
    
    inline def ComponentCustomState(key: String, `type`: String, value: CustomState): typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentCustomState = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentCustomState]
    }
    
    inline def ComponentPropState(key: String, `type`: String, value: Any): typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentPropState = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentPropState]
    }
    
    inline def ComponentStateBase(key: String, `type`: String, value: Any): typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentStateBase = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentStateBase]
    }
  }
  
  trait ComponentStateBase
    extends StObject
       with StateBase
       with ComponentState {
    
    var `type`: String
  }
  object ComponentStateBase {
    
    inline def apply(key: String, `type`: String, value: Any): ComponentStateBase = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentStateBase]
    }
    
    extension [Self <: ComponentStateBase](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentTreeNode extends StObject {
    
    var autoOpen: Boolean
    
    var children: js.Array[ComponentTreeNode]
    
    var consoleId: js.UndefOr[String] = js.undefined
    
    var domOrder: js.UndefOr[js.Array[Double]] = js.undefined
    
    var hasChildren: Boolean
    
    var id: String
    
    var inactive: Boolean
    
    var isFragment: Boolean
    
    var isRouterView: js.UndefOr[Boolean] = js.undefined
    
    var macthedRouteSegment: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[Any] = js.undefined
    
    var name: String
    
    var renderKey: String | Double
    
    var tags: js.Array[InspectorNodeTag]
    
    var uid: ID
  }
  object ComponentTreeNode {
    
    inline def apply(
      autoOpen: Boolean,
      children: js.Array[ComponentTreeNode],
      hasChildren: Boolean,
      id: String,
      inactive: Boolean,
      isFragment: Boolean,
      name: String,
      renderKey: String | Double,
      tags: js.Array[InspectorNodeTag],
      uid: ID
    ): ComponentTreeNode = {
      val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderKey = renderKey.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentTreeNode]
    }
    
    extension [Self <: ComponentTreeNode](x: Self) {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ComponentTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ComponentTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setConsoleId(value: String): Self = StObject.set(x, "consoleId", value.asInstanceOf[js.Any])
      
      inline def setConsoleIdUndefined: Self = StObject.set(x, "consoleId", js.undefined)
      
      inline def setDomOrder(value: js.Array[Double]): Self = StObject.set(x, "domOrder", value.asInstanceOf[js.Any])
      
      inline def setDomOrderUndefined: Self = StObject.set(x, "domOrder", js.undefined)
      
      inline def setDomOrderVarargs(value: Double*): Self = StObject.set(x, "domOrder", js.Array(value*))
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      inline def setIsFragment(value: Boolean): Self = StObject.set(x, "isFragment", value.asInstanceOf[js.Any])
      
      inline def setIsRouterView(value: Boolean): Self = StObject.set(x, "isRouterView", value.asInstanceOf[js.Any])
      
      inline def setIsRouterViewUndefined: Self = StObject.set(x, "isRouterView", js.undefined)
      
      inline def setMacthedRouteSegment(value: String): Self = StObject.set(x, "macthedRouteSegment", value.asInstanceOf[js.Any])
      
      inline def setMacthedRouteSegmentUndefined: Self = StObject.set(x, "macthedRouteSegment", js.undefined)
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRenderKey(value: String | Double): Self = StObject.set(x, "renderKey", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[InspectorNodeTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: InspectorNodeTag*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUid(value: ID): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomState extends StObject {
    
    var _custom: Actions
  }
  object CustomState {
    
    inline def apply(_custom: Actions): CustomState = {
      val __obj = js.Dynamic.literal(_custom = _custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomState]
    }
    
    extension [Self <: CustomState](x: Self) {
      
      inline def set_custom(value: Actions): Self = StObject.set(x, "_custom", value.asInstanceOf[js.Any])
    }
  }
  
  trait InspectedComponentData extends StObject {
    
    var file: String
    
    var functional: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var name: String
    
    var state: js.Array[ComponentState]
  }
  object InspectedComponentData {
    
    inline def apply(file: String, id: String, name: String, state: js.Array[ComponentState]): InspectedComponentData = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[InspectedComponentData]
    }
    
    extension [Self <: InspectedComponentData](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFunctional(value: Boolean): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
      
      inline def setFunctionalUndefined: Self = StObject.set(x, "functional", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setState(value: js.Array[ComponentState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateVarargs(value: ComponentState*): Self = StObject.set(x, "state", js.Array(value*))
    }
  }
  
  trait StateBase extends StObject {
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var key: String
    
    var objectType: js.UndefOr[ref | reactive | computed | other] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
    
    var value: Any
  }
  object StateBase {
    
    inline def apply(key: String, value: Any): StateBase = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateBase]
    }
    
    extension [Self <: StateBase](x: Self) {
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setObjectType(value: ref | reactive | computed | other): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
      
      inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
