package typingsJapgolly.winrtUwp.global.Windows.UI

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.UI.Popups.IUICommand
import typingsJapgolly.winrtUwp.Windows.UI.Popups.MessageDialogOptions
import typingsJapgolly.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for context menus and message dialogs. */
object Popups {
  
  /** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
  @JSGlobal("Windows.UI.Popups.MessageDialog")
  @js.native
  open class MessageDialog protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Popups.MessageDialog {
    /**
      * Initializes a new instance of the MessageDialog class to display an untitled message dialog that can be used to ask your user simple questions.
      * @param content The message displayed to the user.
      */
    def this(content: String) = this()
    /**
      * Initializes a new instance of the MessageDialog class to display a titled message dialog that can be used to ask your user simple questions.
      * @param content The message displayed to the user.
      * @param title The title you want displayed on the dialog.
      */
    def this(content: String, title: String) = this()
    
    /** Gets or sets the index of the command you want to use as the cancel command. This is the command that fires when users press the ESC key. */
    /* CompleteClass */
    var cancelCommandIndex: Double = js.native
    
    /** Gets an array of commands that appear in the command bar of the message dialog. These commands makes the dialog actionable. */
    /* CompleteClass */
    var commands: IVector[IUICommand] = js.native
    
    /** Gets or sets the message to be displayed to the user. */
    /* CompleteClass */
    var content: String = js.native
    
    /** Gets or sets the index of the command you want to use as the default. This is the command that fires by default when users press the ENTER key. */
    /* CompleteClass */
    var defaultCommandIndex: Double = js.native
    
    /** Gets or sets the options for a MessageDialog . */
    /* CompleteClass */
    var options: MessageDialogOptions = js.native
    
    /**
      * Begins an asynchronous operation showing a dialog.
      * @return An object that represents the asynchronous operation. For more on the async pattern, see Asynchronous programming.
      */
    /* CompleteClass */
    override def showAsync(): IPromiseWithIAsyncOperation[IUICommand] = js.native
    
    /** Gets or sets the title to display on the dialog, if any. */
    /* CompleteClass */
    var title: String = js.native
  }
  
  /** Specifies less frequently used options for a MessageDialog . */
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.UI.Popups.MessageDialogOptions & Double] = js.native
    
    /* 1 */ val acceptUserInputAfterDelay: typingsJapgolly.winrtUwp.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.UI.Popups.MessageDialogOptions.none & Double = js.native
  }
  
  /** Specifies where the context menu should be positioned relative to the selection rectangle. */
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement & Double] = js.native
    
    /* 0 */ val default: typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement.default & Double = js.native
    
    /* 1 */ val above: typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement.above & Double = js.native
    
    /* 2 */ val below: typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement.below & Double = js.native
    
    /* 3 */ val left: typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement.left & Double = js.native
    
    /* 4 */ val right: typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement.right & Double = js.native
  }
  
  /** Represents a context menu. */
  @JSGlobal("Windows.UI.Popups.PopupMenu")
  @js.native
  /** Creates a new instance of the PopupMenu class. */
  open class PopupMenu ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Popups.PopupMenu
  
  /** Represents a command in a context menu. */
  @JSGlobal("Windows.UI.Popups.UICommand")
  @js.native
  /** Creates a new instance of the UICommand class. */
  open class UICommand ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Popups.UICommand {
    /**
      * Creates a new instance of the UICommand class using the specified label.
      * @param label The label for the UICommand .
      */
    def this(label: String) = this()
    /**
      * Creates a new instance of the UICommand class using the specified label and event handler.
      * @param label The label for the new command.
      * @param action The event handler for the new command.
      */
    def this(label: String, action: UICommandInvokedHandler) = this()
    /**
      * Creates a new instance of the UICommand class using the specified label, event handler, and command identifier.
      * @param label The label for the new command.
      * @param action The event handler for the new command.
      * @param commandId The command identifier for the new command.
      */
    def this(label: String, action: UICommandInvokedHandler, commandId: Any) = this()
    
    /** Gets or sets the identifier of the command. */
    /* CompleteClass */
    var id: Any = js.native
    
    /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /** Gets or sets the label for the command. */
    /* CompleteClass */
    var label: String = js.native
  }
  
  /** Represents a command separator in a context menu. */
  @JSGlobal("Windows.UI.Popups.UICommandSeparator")
  @js.native
  /** Creates a new instance of the UICommandSeparator class. */
  open class UICommandSeparator ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Popups.UICommandSeparator {
    
    /** Gets or sets the identifier of the command separator. */
    /* CompleteClass */
    var id: Any = js.native
    
    /** Gets or sets the handler for the event that is fired for the command separator. */
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /** Gets or sets the handler for the event that is fired for the command separator. */
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /** Gets or sets the label for the command separator. */
    /* CompleteClass */
    var label: String = js.native
  }
}
