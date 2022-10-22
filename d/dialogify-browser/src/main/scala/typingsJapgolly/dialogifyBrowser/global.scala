package typingsJapgolly.dialogifyBrowser

import typingsJapgolly.dialogifyBrowser.Dialogify.AlertDialogOptions
import typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_CENTER
import typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_DANGER
import typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_LEFT
import typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_PRIMARY
import typingsJapgolly.dialogifyBrowser.Dialogify.ConfirmDialogOptions
import typingsJapgolly.dialogifyBrowser.Dialogify.DialogOptions
import typingsJapgolly.dialogifyBrowser.Dialogify.LocalizableButtonActions
import typingsJapgolly.dialogifyBrowser.Dialogify.PromptDialogOptions
import typingsJapgolly.dialogifyBrowser.Dialogify.SIZE_LARGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Dialogify")
  @js.native
  open class Dialogify protected ()
    extends StObject
       with typingsJapgolly.dialogifyBrowser.Dialogify {
    /**
      * @param source id selector | ajax target url | HTML string that to be used for dialog content.
      * @param dialogOptions Dialog options to be used to create a new Dialogify object.
      */
    def this(source: String) = this()
    def this(source: String, dialogOptions: DialogOptions) = this()
  }
  object Dialogify {
    
    @JSGlobal("Dialogify")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Dialogify.BUTTON_CENTER")
    @js.native
    def BUTTON_CENTER: typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_CENTER = js.native
    inline def BUTTON_CENTER_=(x: BUTTON_CENTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_CENTER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dialogify.BUTTON_DANGER")
    @js.native
    def BUTTON_DANGER: typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_DANGER = js.native
    inline def BUTTON_DANGER_=(x: BUTTON_DANGER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_DANGER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dialogify.BUTTON_LEFT")
    @js.native
    def BUTTON_LEFT: typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_LEFT = js.native
    inline def BUTTON_LEFT_=(x: BUTTON_LEFT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_LEFT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dialogify.BUTTON_PRIMARY")
    @js.native
    def BUTTON_PRIMARY: typingsJapgolly.dialogifyBrowser.Dialogify.BUTTON_PRIMARY = js.native
    inline def BUTTON_PRIMARY_=(x: BUTTON_PRIMARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_PRIMARY")(x.asInstanceOf[js.Any])
    
    /* Inlined {[ key in dialogify-browser.Dialogify.locale ]: dialogify-browser.Dialogify.LocalizableButtonActions} */
    object LOCALE {
      
      @JSGlobal("Dialogify.LOCALE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Dialogify.LOCALE.en_US")
      @js.native
      def enUS: LocalizableButtonActions = js.native
      
      inline def enUS_=(x: LocalizableButtonActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("en_US")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Dialogify.LOCALE.zh_CN")
      @js.native
      def zhCN: LocalizableButtonActions = js.native
      
      inline def zhCN_=(x: LocalizableButtonActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh_CN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Dialogify.LOCALE.zh_TW")
      @js.native
      def zhTW: LocalizableButtonActions = js.native
      
      inline def zhTW_=(x: LocalizableButtonActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh_TW")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSGlobal("Dialogify.SIZE_LARGE")
    @js.native
    def SIZE_LARGE: typingsJapgolly.dialogifyBrowser.Dialogify.SIZE_LARGE = js.native
    inline def SIZE_LARGE_=(x: SIZE_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIZE_LARGE")(x.asInstanceOf[js.Any])
    
    /**
      * Display a dialog with a message, and to wait until the user dismisses the dialog.
      * @param message content to diaplay in dialog, can be html or text.
      * @param options options of a dialog.
      */
    /* static member */
    inline def alert(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def alert(message: String, options: AlertDialogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Close all active dialogs.
      */
    /* static member */
    inline def closeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")().asInstanceOf[Unit]
    
    /**
      * Display a dialog with a message, and to wait until the user either confirms or cancels the dialog.
      * @param message content to diaplay in dialog, can be html or text.
      * @param options options of a dialog.
      */
    /* static member */
    inline def confirm(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def confirm(message: String, options: ConfirmDialogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Display a dialog with a message prompting the user to input some text, and to wait until the user either submits the text or cancels the dialog.
      * @param message content to diaplay in dialog, can be html or text.
      * @param options options of a dialog.
      */
    /* static member */
    inline def prompt(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def prompt(message: String, options: PromptDialogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
