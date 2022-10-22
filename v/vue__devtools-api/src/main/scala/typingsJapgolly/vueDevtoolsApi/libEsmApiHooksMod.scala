package typingsJapgolly.vueDevtoolsApi

import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.editComponentState
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.editInspectorState
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getAppDevtoolsOptions
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getAppRecordName
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getAppRootInstance
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentBounds
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentInstances
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentName
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentRenderCode
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentRootElements
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getElementComponent
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getInspectorState
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getInspectorTree
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.inspectComponent
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.inspectTimelineEvent
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.registerApplication
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.setPluginSettings
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.timelineCleared
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.transformCall
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.visitComponentTree
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.walkComponentParents
import typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.walkComponentTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmApiHooksMod {
  
  trait ComponentBounds extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object ComponentBounds {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): ComponentBounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentBounds]
    }
    
    extension [Self <: ComponentBounds](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vueDevtoolsApi.anon.NewKey
    - typingsJapgolly.vueDevtoolsApi.anon.Remove
  */
  trait EditStatePayload extends StObject
  object EditStatePayload {
    
    inline def NewKey(value: Any): typingsJapgolly.vueDevtoolsApi.anon.NewKey = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vueDevtoolsApi.anon.NewKey]
    }
    
    inline def Remove(newKey: Unit, value: Unit): typingsJapgolly.vueDevtoolsApi.anon.Remove = {
      val __obj = js.Dynamic.literal(newKey = newKey.asInstanceOf[js.Any], remove = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vueDevtoolsApi.anon.Remove]
    }
  }
  
  type HookHandler[TPayload, TContext] = js.Function2[/* payload */ TPayload, /* ctx */ TContext, Unit | js.Promise[Unit]]
  
  @js.native
  trait HookPayloads extends StObject
  
  trait Hookable[TContext] extends StObject {
    
    @JSName("editComponentState")
    def editComponentState_editComponentState(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['editComponentState'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("editInspectorState")
    def editInspectorState_editInspectorState(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['editInspectorState'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getAppRecordName")
    def getAppRecordName_getAppRecordName(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppRecordName'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getAppRootInstance")
    def getAppRootInstance_getAppRootInstance(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppRootInstance'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getComponentBounds")
    def getComponentBounds_getComponentBounds(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentBounds'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getComponentDevtoolsOptions")
    def getComponentDevtoolsOptions_getAppDevtoolsOptions(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppDevtoolsOptions'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getComponentInstances")
    def getComponentInstances_getComponentInstances(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentInstances'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getComponentName")
    def getComponentName_getComponentName(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentName'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getComponentRenderCode")
    def getComponentRenderCode_getComponentRenderCode(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentRenderCode'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getComponentRootElements")
    def getComponentRootElements_getComponentRootElements(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentRootElements'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getElementComponent")
    def getElementComponent_getElementComponent(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getElementComponent'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getInspectorState")
    def getInspectorState_getInspectorState(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getInspectorState'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("getInspectorTree")
    def getInspectorTree_getInspectorTree(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getInspectorTree'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("inspectComponent")
    def inspectComponent_inspectComponent(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['inspectComponent'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("inspectTimelineEvent")
    def inspectTimelineEvent_inspectTimelineEvent(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['inspectTimelineEvent'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("registerApplication")
    def registerApplication_registerApplication(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['registerApplication'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("setPluginSettings")
    def setPluginSettings_setPluginSettings(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['setPluginSettings'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("timelineCleared")
    def timelineCleared_timelineCleared(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['timelineCleared'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("transformCall")
    def transformCall_transformCall(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['transformCall'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("visitComponentTree")
    def visitComponentTree_visitComponentTree(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['visitComponentTree'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("walkComponentParents")
    def walkComponentParents_walkComponentParents(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['walkComponentParents'] */ js.Any, 
          TContext
        ]
    ): Any
    
    @JSName("walkComponentTree")
    def walkComponentTree_walkComponentTree(
      handler: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['walkComponentTree'] */ js.Any, 
          TContext
        ]
    ): Any
  }
  object Hookable {
    
    inline def apply[TContext](
      editComponentState: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['editComponentState'] */ js.Any, 
          TContext
        ] => Any,
      editInspectorState: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['editInspectorState'] */ js.Any, 
          TContext
        ] => Any,
      getAppRecordName: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppRecordName'] */ js.Any, 
          TContext
        ] => Any,
      getAppRootInstance: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppRootInstance'] */ js.Any, 
          TContext
        ] => Any,
      getComponentBounds: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentBounds'] */ js.Any, 
          TContext
        ] => Any,
      getComponentDevtoolsOptions: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppDevtoolsOptions'] */ js.Any, 
          TContext
        ] => Any,
      getComponentInstances: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentInstances'] */ js.Any, 
          TContext
        ] => Any,
      getComponentName: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentName'] */ js.Any, 
          TContext
        ] => Any,
      getComponentRenderCode: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentRenderCode'] */ js.Any, 
          TContext
        ] => Any,
      getComponentRootElements: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentRootElements'] */ js.Any, 
          TContext
        ] => Any,
      getElementComponent: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getElementComponent'] */ js.Any, 
          TContext
        ] => Any,
      getInspectorState: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getInspectorState'] */ js.Any, 
          TContext
        ] => Any,
      getInspectorTree: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getInspectorTree'] */ js.Any, 
          TContext
        ] => Any,
      inspectComponent: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['inspectComponent'] */ js.Any, 
          TContext
        ] => Any,
      inspectTimelineEvent: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['inspectTimelineEvent'] */ js.Any, 
          TContext
        ] => Any,
      registerApplication: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['registerApplication'] */ js.Any, 
          TContext
        ] => Any,
      setPluginSettings: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['setPluginSettings'] */ js.Any, 
          TContext
        ] => Any,
      timelineCleared: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['timelineCleared'] */ js.Any, 
          TContext
        ] => Any,
      transformCall: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['transformCall'] */ js.Any, 
          TContext
        ] => Any,
      visitComponentTree: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['visitComponentTree'] */ js.Any, 
          TContext
        ] => Any,
      walkComponentParents: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['walkComponentParents'] */ js.Any, 
          TContext
        ] => Any,
      walkComponentTree: HookHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['walkComponentTree'] */ js.Any, 
          TContext
        ] => Any
    ): Hookable[TContext] = {
      val __obj = js.Dynamic.literal(editComponentState = js.Any.fromFunction1(editComponentState), editInspectorState = js.Any.fromFunction1(editInspectorState), getAppRecordName = js.Any.fromFunction1(getAppRecordName), getAppRootInstance = js.Any.fromFunction1(getAppRootInstance), getComponentBounds = js.Any.fromFunction1(getComponentBounds), getComponentDevtoolsOptions = js.Any.fromFunction1(getComponentDevtoolsOptions), getComponentInstances = js.Any.fromFunction1(getComponentInstances), getComponentName = js.Any.fromFunction1(getComponentName), getComponentRenderCode = js.Any.fromFunction1(getComponentRenderCode), getComponentRootElements = js.Any.fromFunction1(getComponentRootElements), getElementComponent = js.Any.fromFunction1(getElementComponent), getInspectorState = js.Any.fromFunction1(getInspectorState), getInspectorTree = js.Any.fromFunction1(getInspectorTree), inspectComponent = js.Any.fromFunction1(inspectComponent), inspectTimelineEvent = js.Any.fromFunction1(inspectTimelineEvent), registerApplication = js.Any.fromFunction1(registerApplication), setPluginSettings = js.Any.fromFunction1(setPluginSettings), timelineCleared = js.Any.fromFunction1(timelineCleared), transformCall = js.Any.fromFunction1(transformCall), visitComponentTree = js.Any.fromFunction1(visitComponentTree), walkComponentParents = js.Any.fromFunction1(walkComponentParents), walkComponentTree = js.Any.fromFunction1(walkComponentTree))
      __obj.asInstanceOf[Hookable[TContext]]
    }
    
    extension [Self <: Hookable[?], TContext](x: Self & Hookable[TContext]) {
      
      inline def setEditComponentState(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['editComponentState'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "editComponentState", js.Any.fromFunction1(value))
      
      inline def setEditInspectorState(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['editInspectorState'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "editInspectorState", js.Any.fromFunction1(value))
      
      inline def setGetAppRecordName(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppRecordName'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getAppRecordName", js.Any.fromFunction1(value))
      
      inline def setGetAppRootInstance(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppRootInstance'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getAppRootInstance", js.Any.fromFunction1(value))
      
      inline def setGetComponentBounds(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentBounds'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getComponentBounds", js.Any.fromFunction1(value))
      
      inline def setGetComponentDevtoolsOptions(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getAppDevtoolsOptions'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getComponentDevtoolsOptions", js.Any.fromFunction1(value))
      
      inline def setGetComponentInstances(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentInstances'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getComponentInstances", js.Any.fromFunction1(value))
      
      inline def setGetComponentName(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentName'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getComponentName", js.Any.fromFunction1(value))
      
      inline def setGetComponentRenderCode(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentRenderCode'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getComponentRenderCode", js.Any.fromFunction1(value))
      
      inline def setGetComponentRootElements(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getComponentRootElements'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getComponentRootElements", js.Any.fromFunction1(value))
      
      inline def setGetElementComponent(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getElementComponent'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getElementComponent", js.Any.fromFunction1(value))
      
      inline def setGetInspectorState(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getInspectorState'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getInspectorState", js.Any.fromFunction1(value))
      
      inline def setGetInspectorTree(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['getInspectorTree'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "getInspectorTree", js.Any.fromFunction1(value))
      
      inline def setInspectComponent(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['inspectComponent'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "inspectComponent", js.Any.fromFunction1(value))
      
      inline def setInspectTimelineEvent(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['inspectTimelineEvent'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "inspectTimelineEvent", js.Any.fromFunction1(value))
      
      inline def setRegisterApplication(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['registerApplication'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "registerApplication", js.Any.fromFunction1(value))
      
      inline def setSetPluginSettings(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['setPluginSettings'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "setPluginSettings", js.Any.fromFunction1(value))
      
      inline def setTimelineCleared(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['timelineCleared'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "timelineCleared", js.Any.fromFunction1(value))
      
      inline def setTransformCall(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['transformCall'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "transformCall", js.Any.fromFunction1(value))
      
      inline def setVisitComponentTree(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['visitComponentTree'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "visitComponentTree", js.Any.fromFunction1(value))
      
      inline def setWalkComponentParents(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['walkComponentParents'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "walkComponentParents", js.Any.fromFunction1(value))
      
      inline def setWalkComponentTree(
        value: HookHandler[
              /* import warning: importer.ImportType#apply Failed type conversion: @vue/devtools-api.@vue/devtools-api/lib/esm/api/hooks.HookPayloads['walkComponentTree'] */ js.Any, 
              TContext
            ] => Any
      ): Self = StObject.set(x, "walkComponentTree", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.transformCall
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getAppRecordName
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getAppRootInstance
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.registerApplication
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.walkComponentTree
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.visitComponentTree
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.walkComponentParents
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.inspectComponent
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentBounds
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentName
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentInstances
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getElementComponent
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentRootElements
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.editComponentState
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getAppDevtoolsOptions
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getComponentRenderCode
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.inspectTimelineEvent
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.timelineCleared
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getInspectorTree
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.getInspectorState
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.editInspectorState
    - typingsJapgolly.vueDevtoolsApi.vueDevtoolsApiStrings.setPluginSettings
  */
  trait Hooks extends StObject
  object Hooks {
    
    inline def EDIT_COMPONENT_STATE: editComponentState = "editComponentState".asInstanceOf[editComponentState]
    
    inline def EDIT_INSPECTOR_STATE: editInspectorState = "editInspectorState".asInstanceOf[editInspectorState]
    
    inline def GET_APP_RECORD_NAME: getAppRecordName = "getAppRecordName".asInstanceOf[getAppRecordName]
    
    inline def GET_APP_ROOT_INSTANCE: getAppRootInstance = "getAppRootInstance".asInstanceOf[getAppRootInstance]
    
    inline def GET_COMPONENT_BOUNDS: getComponentBounds = "getComponentBounds".asInstanceOf[getComponentBounds]
    
    inline def GET_COMPONENT_DEVTOOLS_OPTIONS: getAppDevtoolsOptions = "getAppDevtoolsOptions".asInstanceOf[getAppDevtoolsOptions]
    
    inline def GET_COMPONENT_INSTANCES: getComponentInstances = "getComponentInstances".asInstanceOf[getComponentInstances]
    
    inline def GET_COMPONENT_NAME: getComponentName = "getComponentName".asInstanceOf[getComponentName]
    
    inline def GET_COMPONENT_RENDER_CODE: getComponentRenderCode = "getComponentRenderCode".asInstanceOf[getComponentRenderCode]
    
    inline def GET_COMPONENT_ROOT_ELEMENTS: getComponentRootElements = "getComponentRootElements".asInstanceOf[getComponentRootElements]
    
    inline def GET_ELEMENT_COMPONENT: getElementComponent = "getElementComponent".asInstanceOf[getElementComponent]
    
    inline def GET_INSPECTOR_STATE: getInspectorState = "getInspectorState".asInstanceOf[getInspectorState]
    
    inline def GET_INSPECTOR_TREE: getInspectorTree = "getInspectorTree".asInstanceOf[getInspectorTree]
    
    inline def INSPECT_COMPONENT: inspectComponent = "inspectComponent".asInstanceOf[inspectComponent]
    
    inline def INSPECT_TIMELINE_EVENT: inspectTimelineEvent = "inspectTimelineEvent".asInstanceOf[inspectTimelineEvent]
    
    inline def REGISTER_APPLICATION: registerApplication = "registerApplication".asInstanceOf[registerApplication]
    
    inline def SET_PLUGIN_SETTINGS: setPluginSettings = "setPluginSettings".asInstanceOf[setPluginSettings]
    
    inline def TIMELINE_CLEARED: timelineCleared = "timelineCleared".asInstanceOf[timelineCleared]
    
    inline def TRANSFORM_CALL: transformCall = "transformCall".asInstanceOf[transformCall]
    
    inline def VISIT_COMPONENT_TREE: visitComponentTree = "visitComponentTree".asInstanceOf[visitComponentTree]
    
    inline def WALK_COMPONENT_PARENTS: walkComponentParents = "walkComponentParents".asInstanceOf[walkComponentParents]
    
    inline def WALK_COMPONENT_TREE: walkComponentTree = "walkComponentTree".asInstanceOf[walkComponentTree]
  }
}
