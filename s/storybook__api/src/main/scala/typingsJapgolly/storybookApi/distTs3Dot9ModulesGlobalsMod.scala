package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesGlobalsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/globals", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait SubAPI extends StObject {
    
    def getGlobalTypes(): Any
    
    def getGlobals(): Any
    
    def updateGlobals(
      newGlobals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
    ): Unit
  }
  object SubAPI {
    
    inline def apply(
      getGlobalTypes: CallbackTo[Any],
      getGlobals: CallbackTo[Any],
      updateGlobals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any => Callback
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getGlobalTypes = getGlobalTypes.toJsFn, getGlobals = getGlobals.toJsFn, updateGlobals = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any) => updateGlobals(t0).runNow()))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setGetGlobalTypes(value: CallbackTo[Any]): Self = StObject.set(x, "getGlobalTypes", value.toJsFn)
      
      inline def setGetGlobals(value: CallbackTo[Any]): Self = StObject.set(x, "getGlobals", value.toJsFn)
      
      inline def setUpdateGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any => Callback
      ): Self = StObject.set(x, "updateGlobals", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any) => value(t0).runNow()))
    }
  }
  
  trait SubState extends StObject {
    
    var globalTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ] = js.undefined
    
    var globals: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ] = js.undefined
  }
  object SubState {
    
    inline def apply(): SubState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setGlobalTypes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ): Self = StObject.set(x, "globalTypes", value.asInstanceOf[js.Any])
      
      inline def setGlobalTypesUndefined: Self = StObject.set(x, "globalTypes", js.undefined)
      
      inline def setGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    }
  }
}
