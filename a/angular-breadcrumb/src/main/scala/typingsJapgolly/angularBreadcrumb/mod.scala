package typingsJapgolly.angularBreadcrumb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.angularBreadcrumb.anon.Label
import typingsJapgolly.angularBreadcrumb.mod.angularAugmentingMod.ui.IState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-breadcrumb", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    object ncy {
      
      trait breadcrumbProvider extends StObject {
        
        /**
          * Setter for options defined in a module.config block
          **/
        def setOptions(options: breadcrumbProviderOptions): Unit
      }
      object breadcrumbProvider {
        
        inline def apply(setOptions: breadcrumbProviderOptions => Callback): breadcrumbProvider = {
          val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1((t0: breadcrumbProviderOptions) => setOptions(t0).runNow()))
          __obj.asInstanceOf[breadcrumbProvider]
        }
        
        extension [Self <: breadcrumbProvider](x: Self) {
          
          inline def setSetOptions(value: breadcrumbProviderOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: breadcrumbProviderOptions) => value(t0).runNow()))
        }
      }
      
      trait breadcrumbProviderOptions extends StObject {
        
        /**
          * If true, abstract states are included in the breadcrumb. This option has a lower priority than the state-specific option skip
          **/
        var includeAbstract: js.UndefOr[Boolean] = js.undefined
        
        /**
          * An existing state's name to be the state is the first step of the breadcrumb
          **/
        var prefixStateName: js.UndefOr[String] = js.undefined
        
        /**
          * Contains a predefined template's name; 'bootstrap3' (default), 'bootstrap2' or HTML for a custom template. This property is ignored if templateUrl is defined.
          **/
        var template: js.UndefOr[String] = js.undefined
        
        /**
          * Contains the path to a template file. This property takes precedence over the template property.
          **/
        var templateUrl: js.UndefOr[String] = js.undefined
      }
      object breadcrumbProviderOptions {
        
        inline def apply(): breadcrumbProviderOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[breadcrumbProviderOptions]
        }
        
        extension [Self <: breadcrumbProviderOptions](x: Self) {
          
          inline def setIncludeAbstract(value: Boolean): Self = StObject.set(x, "includeAbstract", value.asInstanceOf[js.Any])
          
          inline def setIncludeAbstractUndefined: Self = StObject.set(x, "includeAbstract", js.undefined)
          
          inline def setPrefixStateName(value: String): Self = StObject.set(x, "prefixStateName", value.asInstanceOf[js.Any])
          
          inline def setPrefixStateNameUndefined: Self = StObject.set(x, "prefixStateName", js.undefined)
          
          inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
          
          inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
          
          inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
          
          inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
        }
      }
      
      trait breadcrumbService extends StObject {
        
        /**
          * Return the last step of the breadcrumb, generally the one relative to the current state, expect if it is configured as skipped (the method returns its parent). As getStatesChain, the state object is enriched with ncyBreadcrumbLink.
          **/
        def getLastStep(): IState
        
        /**
          * Returns the state chain to the current state (i.e. all the steps of the breadcrumb). It's an array of state object enriched with the module-specific property ncyBreadcrumbLink (the href for the breadcrumb step).
          **/
        def getStatesChain(): js.Array[IState]
      }
      object breadcrumbService {
        
        inline def apply(getLastStep: CallbackTo[IState], getStatesChain: CallbackTo[js.Array[IState]]): breadcrumbService = {
          val __obj = js.Dynamic.literal(getLastStep = getLastStep.toJsFn, getStatesChain = getStatesChain.toJsFn)
          __obj.asInstanceOf[breadcrumbService]
        }
        
        extension [Self <: breadcrumbService](x: Self) {
          
          inline def setGetLastStep(value: CallbackTo[IState]): Self = StObject.set(x, "getLastStep", value.toJsFn)
          
          inline def setGetStatesChain(value: CallbackTo[js.Array[IState]]): Self = StObject.set(x, "getStatesChain", value.toJsFn)
        }
      }
    }
    
    object ui {
      
      trait IState extends StObject {
        
        var ncyBreadcrumb: js.UndefOr[Label] = js.undefined
        
        var ncyBreadcrumbLabel: js.UndefOr[String] = js.undefined
        
        var ncyBreadcrumbLink: js.UndefOr[String] = js.undefined
      }
      object IState {
        
        inline def apply(): IState = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IState]
        }
        
        extension [Self <: IState](x: Self) {
          
          inline def setNcyBreadcrumb(value: Label): Self = StObject.set(x, "ncyBreadcrumb", value.asInstanceOf[js.Any])
          
          inline def setNcyBreadcrumbLabel(value: String): Self = StObject.set(x, "ncyBreadcrumbLabel", value.asInstanceOf[js.Any])
          
          inline def setNcyBreadcrumbLabelUndefined: Self = StObject.set(x, "ncyBreadcrumbLabel", js.undefined)
          
          inline def setNcyBreadcrumbLink(value: String): Self = StObject.set(x, "ncyBreadcrumbLink", value.asInstanceOf[js.Any])
          
          inline def setNcyBreadcrumbLinkUndefined: Self = StObject.set(x, "ncyBreadcrumbLink", js.undefined)
          
          inline def setNcyBreadcrumbUndefined: Self = StObject.set(x, "ncyBreadcrumb", js.undefined)
        }
      }
    }
  }
}
