package typingsJapgolly.interactjsTypes

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.interactjsTypes.anon.FnCallThisNewValue
import typingsJapgolly.interactjsTypes.coreScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInteractablePreventDefaultMod {
  
  @JSImport("@interactjs/core/interactablePreventDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@interactjs/core/interactablePreventDefault", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/core/interactablePreventDefault", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/core/interactablePreventDefault", "default.install")
    @js.native
    def install: js.Function1[/* scope */ Scope, Unit] = js.native
    inline def install(scope: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def install_=(x: js.Function1[/* scope */ Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/core/interactablePreventDefault", "default.listeners")
    @js.native
    def listeners: Any = js.native
    inline def listeners_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listeners")(x.asInstanceOf[js.Any])
  }
  
  inline def install(scope: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.interactjsTypes.interactjsTypesStrings.always
    - typingsJapgolly.interactjsTypes.interactjsTypesStrings.never
    - typingsJapgolly.interactjsTypes.interactjsTypesStrings.auto
  */
  trait PreventDefaultValue extends StObject
  object PreventDefaultValue {
    
    inline def always: typingsJapgolly.interactjsTypes.interactjsTypesStrings.always = "always".asInstanceOf[typingsJapgolly.interactjsTypes.interactjsTypesStrings.always]
    
    inline def auto: typingsJapgolly.interactjsTypes.interactjsTypesStrings.auto = "auto".asInstanceOf[typingsJapgolly.interactjsTypes.interactjsTypesStrings.auto]
    
    inline def never: typingsJapgolly.interactjsTypes.interactjsTypesStrings.never = "never".asInstanceOf[typingsJapgolly.interactjsTypes.interactjsTypesStrings.never]
  }
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    trait Interactable extends StObject {
      
      def checkAndPreventDefault(event: Event): Unit
      
      def preventDefault(): PreventDefaultValue
      def preventDefault(newValue: PreventDefaultValue): /* import warning: importer.ImportType#apply Failed type conversion: typeof this */ js.Any
      @JSName("preventDefault")
      var preventDefault_Original: FnCallThisNewValue
    }
    object Interactable {
      
      inline def apply(checkAndPreventDefault: Event => Callback, preventDefault: FnCallThisNewValue): Interactable = {
        val __obj = js.Dynamic.literal(checkAndPreventDefault = js.Any.fromFunction1((t0: Event) => checkAndPreventDefault(t0).runNow()), preventDefault = preventDefault.asInstanceOf[js.Any])
        __obj.asInstanceOf[Interactable]
      }
      
      extension [Self <: Interactable](x: Self) {
        
        inline def setCheckAndPreventDefault(value: Event => Callback): Self = StObject.set(x, "checkAndPreventDefault", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
        
        inline def setPreventDefault(value: FnCallThisNewValue): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      }
    }
  }
}
