package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiCoreControlMod.default
import typingsJapgolly.openui5.sapUiIntegrationLibraryMod.CardActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionConfig extends StObject {
  
  /**
    * The action configuration.
    */
  var actionConfig: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The action source.
    */
  var actionSource: js.UndefOr[default] = js.undefined
  
  /**
    * The card the action is fired from.
    */
  var card: js.UndefOr[default] = js.undefined
  
  /**
    * The parameters related to the triggered action.
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The type of the action.
    */
  var `type`: js.UndefOr[
    CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
  ] = js.undefined
}
object ActionConfig {
  
  inline def apply(): ActionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionConfig]
  }
  
  extension [Self <: ActionConfig](x: Self) {
    
    inline def setActionConfig(value: js.Object): Self = StObject.set(x, "actionConfig", value.asInstanceOf[js.Any])
    
    inline def setActionConfigUndefined: Self = StObject.set(x, "actionConfig", js.undefined)
    
    inline def setActionSource(value: default): Self = StObject.set(x, "actionSource", value.asInstanceOf[js.Any])
    
    inline def setActionSourceUndefined: Self = StObject.set(x, "actionSource", js.undefined)
    
    inline def setCard(value: default): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(
      value: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
