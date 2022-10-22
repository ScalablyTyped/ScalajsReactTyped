package typingsJapgolly.reactBootstrapConfirmation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bootstrap-confirmation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alert(message: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def alert(message: String, options: AlertOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def confirm(message: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def confirm(message: String, options: ConfirmOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait AlertOptions extends StObject {
    
    /**
      * The style of the "OK" button. Must correspond to one of the 6 button styles of Bootstrap.
      * @default "primary"
      */
    var okButtonStyle: js.UndefOr[BootstrapStyleFlags] = js.undefined
    
    /**
      * The text of the "OK" button.
      * @default "OK"
      */
    var okText: js.UndefOr[String] = js.undefined
    
    /**
      * A facultative title to use for the modal.
      * @default undefined
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object AlertOptions {
    
    inline def apply(): AlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertOptions]
    }
    
    extension [Self <: AlertOptions](x: Self) {
      
      inline def setOkButtonStyle(value: BootstrapStyleFlags): Self = StObject.set(x, "okButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setOkButtonStyleUndefined: Self = StObject.set(x, "okButtonStyle", js.undefined)
      
      inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.primary
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.secondary
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.success
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.danger
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.warning
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.info
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.light
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.dark
    - typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.link
  */
  trait BootstrapStyleFlags extends StObject
  object BootstrapStyleFlags {
    
    inline def danger: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.danger = "danger".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.danger]
    
    inline def dark: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.dark = "dark".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.dark]
    
    inline def info: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.info = "info".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.info]
    
    inline def light: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.light = "light".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.light]
    
    inline def link: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.link = "link".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.link]
    
    inline def primary: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.primary = "primary".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.primary]
    
    inline def secondary: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.secondary]
    
    inline def success: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.success = "success".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.success]
    
    inline def warning: typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.warning = "warning".asInstanceOf[typingsJapgolly.reactBootstrapConfirmation.reactBootstrapConfirmationStrings.warning]
  }
  
  trait ConfirmOptions
    extends StObject
       with AlertOptions {
    
    /**
      * The style of the "Cancel" button. Must correspond to one of the 6 button styles of Bootstrap.
      * @default "secondary"
      */
    var cancelButtonStyle: js.UndefOr[BootstrapStyleFlags] = js.undefined
    
    /**
      * The text of the "Cancel" button.
      * @default "Cancel"
      */
    var cancelText: js.UndefOr[String] = js.undefined
  }
  object ConfirmOptions {
    
    inline def apply(): ConfirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmOptions]
    }
    
    extension [Self <: ConfirmOptions](x: Self) {
      
      inline def setCancelButtonStyle(value: BootstrapStyleFlags): Self = StObject.set(x, "cancelButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonStyleUndefined: Self = StObject.set(x, "cancelButtonStyle", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    }
  }
}
