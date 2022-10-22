package typingsJapgolly.activexIwshruntimelibrary

import typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.ShortcutWindowStyle
import typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshExecStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object IWshRuntimeLibrary {
    
    @JSGlobal("IWshRuntimeLibrary.TextStreamBase")
    @js.native
    open class TextStreamBase ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamBase {
      
      /**
        * Closes a text stream.
        * It is not necessary to close standard streams; they close automatically when the process ends. If
        * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
        */
      /* CompleteClass */
      override def Close(): Unit = js.native
      
      /**
        * The column number of the current character position in an input stream.
        */
      /* CompleteClass */
      var Column: Double = js.native
      
      /**
        * The current line number in an input stream.
        */
      /* CompleteClass */
      var Line: Double = js.native
    }
    
    @JSGlobal("IWshRuntimeLibrary.TextStreamReader")
    @js.native
    /* private */ open class TextStreamReader ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader {
      
      /**
        * Indicates whether the stream pointer position is at the end of a line.
        */
      /* CompleteClass */
      var AtEndOfLine: Boolean = js.native
      
      /**
        * Indicates whether the stream pointer position is at the end of a stream.
        */
      /* CompleteClass */
      var AtEndOfStream: Boolean = js.native
      
      /**
        * Closes a text stream.
        * It is not necessary to close standard streams; they close automatically when the process ends. If
        * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
        */
      /* CompleteClass */
      override def Close(): Unit = js.native
      
      /**
        * The column number of the current character position in an input stream.
        */
      /* CompleteClass */
      var Column: Double = js.native
      
      /* private */ /* CompleteClass */
      @JSName("IWshRuntimeLibrary.TextStreamReader_typekey")
      var IWshRuntimeLibraryDotTextStreamReader_typekey: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader = js.native
      
      /**
        * The current line number in an input stream.
        */
      /* CompleteClass */
      var Line: Double = js.native
      
      /**
        * Returns a specified number of characters from an input stream, starting at the current pointer position.
        * Does not return until the ENTER key is pressed.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        */
      /* CompleteClass */
      override def Read(characters: Double): String = js.native
      
      /**
        * Returns all characters from an input stream.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        */
      /* CompleteClass */
      override def ReadAll(): String = js.native
      
      /**
        * Returns an entire line from an input stream.
        * Although this method extracts the newline character, it does not add it to the returned string.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        */
      /* CompleteClass */
      override def ReadLine(): String = js.native
      
      /**
        * Skips a specified number of characters when reading from an input text stream.
        * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
        * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
        */
      /* CompleteClass */
      override def Skip(characters: Double): Unit = js.native
      
      /**
        * Skips the next line when reading from an input text stream.
        * Can only be used on a stream in reading mode, not writing or appending mode.
        */
      /* CompleteClass */
      override def SkipLine(): Unit = js.native
    }
    
    @JSGlobal("IWshRuntimeLibrary.TextStreamWriter")
    @js.native
    /* private */ open class TextStreamWriter ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter {
      
      /**
        * Closes a text stream.
        * It is not necessary to close standard streams; they close automatically when the process ends. If
        * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
        */
      /* CompleteClass */
      override def Close(): Unit = js.native
      
      /**
        * The column number of the current character position in an input stream.
        */
      /* CompleteClass */
      var Column: Double = js.native
      
      /* private */ /* CompleteClass */
      @JSName("IWshRuntimeLibrary.TextStreamWriter_typekey")
      var IWshRuntimeLibraryDotTextStreamWriter_typekey: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter = js.native
      
      /**
        * The current line number in an input stream.
        */
      /* CompleteClass */
      var Line: Double = js.native
      
      /**
        * Sends a string to an output stream.
        */
      /* CompleteClass */
      override def Write(s: String): Unit = js.native
      
      /**
        * Sends a specified number of blank lines (newline characters) to an output stream.
        */
      /* CompleteClass */
      override def WriteBlankLines(intLines: Double): Unit = js.native
      
      /**
        * Sends a string followed by a newline character to an output stream.
        */
      /* CompleteClass */
      override def WriteLine(s: String): Unit = js.native
    }
    
    /** WSHExec object */
    @JSGlobal("IWshRuntimeLibrary.WshExec")
    @js.native
    /* private */ open class WshExec ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshExec {
      
      /* CompleteClass */
      override val ExitCode: Double = js.native
      
      /* private */ /* CompleteClass */
      @JSName("IWshRuntimeLibrary.WshExec_typekey")
      var IWshRuntimeLibraryDotWshExec_typekey: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshExec = js.native
      
      /* CompleteClass */
      override val ProcessID: Double = js.native
      
      /* CompleteClass */
      override val Status: WshExecStatus = js.native
      
      /* CompleteClass */
      override val StdErr: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter = js.native
      
      /* CompleteClass */
      override val StdIn: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamReader = js.native
      
      /* CompleteClass */
      override val StdOut: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.TextStreamWriter = js.native
      
      /* CompleteClass */
      override def Terminate(): Unit = js.native
    }
    
    /** Network Object */
    @JSGlobal("IWshRuntimeLibrary.WshNetwork")
    @js.native
    /* private */ open class WshNetwork ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
    
    /** Shell Object */
    @JSGlobal("IWshRuntimeLibrary.WshShell")
    @js.native
    /* private */ open class WshShell ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShell
    
    /** Shortcut Object */
    @JSGlobal("IWshRuntimeLibrary.WshShortcut")
    @js.native
    /* private */ open class WshShortcut ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShortcut {
      
      /* CompleteClass */
      var Arguments: String = js.native
      
      /* CompleteClass */
      var Description: String = js.native
      
      /* CompleteClass */
      override val FullName: String = js.native
      
      /* CompleteClass */
      var Hotkey: String = js.native
      
      /* private */ /* CompleteClass */
      @JSName("IWshRuntimeLibrary.WshShortcut_typekey")
      var IWshRuntimeLibraryDotWshShortcut_typekey: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShortcut = js.native
      
      /* CompleteClass */
      var IconLocation: String = js.native
      
      /* CompleteClass */
      override def Load(PathLink: String): Unit = js.native
      
      /* CompleteClass */
      override val RelativePath: String = js.native
      
      /* CompleteClass */
      override def Save(): Unit = js.native
      
      /* CompleteClass */
      var TargetPath: String = js.native
      
      /**
        * Possible values:
        *
        * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
        * when displaying the window for the first time.
        * * **3** -- Activates the window and displays it as a maximized window.
        * * **7** -- Displays the window as a minimized window. The active window remains active.
        */
      /* CompleteClass */
      var WindowStyle: ShortcutWindowStyle = js.native
      
      /* CompleteClass */
      var WorkingDirectory: String = js.native
    }
    
    /** URLShortcut Object */
    @JSGlobal("IWshRuntimeLibrary.WshURLShortcut")
    @js.native
    /* private */ open class WshURLShortcut ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshURLShortcut {
      
      /* CompleteClass */
      override val FullName: String = js.native
      
      /* private */ /* CompleteClass */
      @JSName("IWshRuntimeLibrary.WshURLShortcut_typekey")
      var IWshRuntimeLibraryDotWshURLShortcut_typekey: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshURLShortcut = js.native
      
      /* CompleteClass */
      override def Load(PathLink: String): Unit = js.native
      
      /* CompleteClass */
      override def Save(): Unit = js.native
      
      /* CompleteClass */
      var TargetPath: String = js.native
    }
  }
  
  object ScriptSigner {
    
    @JSGlobal("ScriptSigner.Signer")
    @js.native
    /* private */ open class Signer ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.ScriptSigner.Signer
  }
  
  object WSHControllerLibrary {
    
    @JSGlobal("WSHControllerLibrary.WSHController")
    @js.native
    /* private */ open class WSHController ()
      extends StObject
         with typingsJapgolly.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
  }
}
