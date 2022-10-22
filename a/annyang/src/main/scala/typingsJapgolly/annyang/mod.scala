package typingsJapgolly.annyang

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Annyang extends StObject {
    
    /**
      * Stop listening, and turn off mic.
      *
      */
    def abort(): Unit = js.native
    
    def addCallback(
      event: Events,
      callback: js.Function3[
          /* userSaid */ js.UndefOr[String], 
          /* commandText */ js.UndefOr[String], 
          /* results */ js.UndefOr[js.Array[String]], 
          Unit
        ]
    ): Unit = js.native
    def addCallback(
      event: Events,
      callback: js.Function3[
          /* userSaid */ js.UndefOr[String], 
          /* commandText */ js.UndefOr[String], 
          /* results */ js.UndefOr[js.Array[String]], 
          Unit
        ],
      context: Any
    ): Unit = js.native
    
    /**
      * Add commands that annyang will respond to. Similar in syntax to init(), but doesn't remove existing commands.
      *
      * #### Examples:
      * ````javascript
      * var commands = {'hello :name': helloFunction, 'howdy': helloFunction};
      * var commands2 = {'hi': helloFunction};
      *
      * annyang.addCommands(commands);
      * annyang.addCommands(commands2);
      * // annyang will now listen to all three commands
      * ````
      */
    def addCommands(commands: CommandOption): Unit = js.native
    
    /**
      * Turn on output of debug messages to the console. Ugly, but super-handy!
      *
      * @param [newState=true] Turn on/off debug messages
      */
    def debug(): Unit = js.native
    def debug(newState: Boolean): Unit = js.native
    
    /**
      * Returns the instance of the browser's SpeechRecognition object used by annyang.
      * Useful in case you want direct access to the browser's Speech Recognition engine.
      */
    def getSpeechRecognizer(): Any = js.native
    
    /**
      * Returns true if speech recognition is currently on.
      * Returns false if speech recognition is off or annyang is paused.
      */
    def isListening(): Boolean = js.native
    
    /**
      * Pause listening. annyang will stop responding to commands (until the resume or start methods are called), without turning off the browser's SpeechRecognition engine or the mic.
      *
      */
    def pause(): Unit = js.native
    
    def removeCallback(): Unit = js.native
    def removeCallback(
      event: Unit,
      callback: js.Function3[/* userSaid */ String, /* commandText */ String, /* results */ js.Array[String], Unit]
    ): Unit = js.native
    def removeCallback(event: Events): Unit = js.native
    def removeCallback(
      event: Events,
      callback: js.Function3[/* userSaid */ String, /* commandText */ String, /* results */ js.Array[String], Unit]
    ): Unit = js.native
    
    /**
      * Removes all existing commands or a specific command
      * #### Examples:
      * ````javascript
      * var commands : annyang.CommandOption = {'hello': helloFunction, 'howdy': helloFunction, 'hi': helloFunction};
      *
      * // Don't respond to hello
      * annyang.removeCommands('hello');
      *
      * // Remove all existing commands
      * annyang.removeCommands();
      * ````
      */
    def removeCommands(): Unit = js.native
    def removeCommands(command: String): Unit = js.native
    /**
      * Removes a list of commands
      * #### Examples:
      * ````javascript
      * var commands : annyang.CommandOption = {'hello': helloFunction, 'howdy': helloFunction, 'hi': helloFunction};
      * // Add some commands
      * annyang.addCommands(commands);
      * // Don't respond to howdy or hi
      * annyang.removeCommands(['howdy', 'hi']);
      * ````
      */
    def removeCommands(command: js.Array[String]): Unit = js.native
    
    /**
      * Resumes listening and restores command callback execution when a result matches.
      * If SpeechRecognition was aborted (stopped), start it.
      *
      */
    def resume(): Unit = js.native
    
    /**
      * Set the language the user will speak in. If this method is not called, defaults to 'en-US'.
      *
      * @see [Languages](https://github.com/TalAter/annyang/blob/master/docs/FAQ.md#what-languages-are-supported)
      */
    def setLanguage(lang: String): Unit = js.native
    
    /**
      * Start listening.
      * It's a good idea to call this after adding some commands first, but not mandatory.
      */
    def start(): Unit = js.native
    def start(options: StartOptions): Unit = js.native
    
    /**
      * Simulate speech being recognized. This will trigger the same events and behavior as when the Speech Recognition
      * detects speech.
      *
      * Can accept either a string containing a single sentence, or an array containing multiple sentences to be checked
      * in order until one of them matches a command (similar to the way Speech Recognition Alternatives are parsed)
      *
      * #### Examples:
      * ````javascript
      * annyang.trigger('Time for some thrilling heroics');
      * annyang.trigger(
      *     ['Time for some thrilling heroics', 'Time for some thrilling aerobics']
      *   );
      * ````
      */
    def trigger(command: String): Unit = js.native
    def trigger(command: js.Array[String]): Unit = js.native
  }
  
  type CommandOption = StringDictionary[CommandOptionRegex | js.Function0[Unit]]
  
  trait CommandOptionRegex extends StObject {
    
    def callback(): Unit
    
    var regexp: js.RegExp
  }
  object CommandOptionRegex {
    
    inline def apply(callback: Callback, regexp: js.RegExp): CommandOptionRegex = {
      val __obj = js.Dynamic.literal(callback = callback.toJsFn, regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandOptionRegex]
    }
    
    extension [Self <: CommandOptionRegex](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.annyang.annyangStrings.start
    - typingsJapgolly.annyang.annyangStrings.soundstart
    - typingsJapgolly.annyang.annyangStrings.error
    - typingsJapgolly.annyang.annyangStrings.end
    - typingsJapgolly.annyang.annyangStrings.result
    - typingsJapgolly.annyang.annyangStrings.resultMatch
    - typingsJapgolly.annyang.annyangStrings.resultNoMatch
    - typingsJapgolly.annyang.annyangStrings.errorNetwork
    - typingsJapgolly.annyang.annyangStrings.errorPermissionBlocked
    - typingsJapgolly.annyang.annyangStrings.errorPermissionDenied
  */
  trait Events extends StObject
  object Events {
    
    inline def end: typingsJapgolly.annyang.annyangStrings.end = "end".asInstanceOf[typingsJapgolly.annyang.annyangStrings.end]
    
    inline def error: typingsJapgolly.annyang.annyangStrings.error = "error".asInstanceOf[typingsJapgolly.annyang.annyangStrings.error]
    
    inline def errorNetwork: typingsJapgolly.annyang.annyangStrings.errorNetwork = "errorNetwork".asInstanceOf[typingsJapgolly.annyang.annyangStrings.errorNetwork]
    
    inline def errorPermissionBlocked: typingsJapgolly.annyang.annyangStrings.errorPermissionBlocked = "errorPermissionBlocked".asInstanceOf[typingsJapgolly.annyang.annyangStrings.errorPermissionBlocked]
    
    inline def errorPermissionDenied: typingsJapgolly.annyang.annyangStrings.errorPermissionDenied = "errorPermissionDenied".asInstanceOf[typingsJapgolly.annyang.annyangStrings.errorPermissionDenied]
    
    inline def result: typingsJapgolly.annyang.annyangStrings.result = "result".asInstanceOf[typingsJapgolly.annyang.annyangStrings.result]
    
    inline def resultMatch: typingsJapgolly.annyang.annyangStrings.resultMatch = "resultMatch".asInstanceOf[typingsJapgolly.annyang.annyangStrings.resultMatch]
    
    inline def resultNoMatch: typingsJapgolly.annyang.annyangStrings.resultNoMatch = "resultNoMatch".asInstanceOf[typingsJapgolly.annyang.annyangStrings.resultNoMatch]
    
    inline def soundstart: typingsJapgolly.annyang.annyangStrings.soundstart = "soundstart".asInstanceOf[typingsJapgolly.annyang.annyangStrings.soundstart]
    
    inline def start: typingsJapgolly.annyang.annyangStrings.start = "start".asInstanceOf[typingsJapgolly.annyang.annyangStrings.start]
  }
  
  trait StartOptions extends StObject {
    
    /**
      * Should annyang restart itself if it is closed indirectly, because of silence or window conflicts?
      */
    var autoRestart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow forcing continuous mode on or off. Annyang is pretty smart about this, so only set this if you know what you're doing.
      */
    var continuous: js.UndefOr[Boolean] = js.undefined
  }
  object StartOptions {
    
    inline def apply(): StartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOptions]
    }
    
    extension [Self <: StartOptions](x: Self) {
      
      inline def setAutoRestart(value: Boolean): Self = StObject.set(x, "autoRestart", value.asInstanceOf[js.Any])
      
      inline def setAutoRestartUndefined: Self = StObject.set(x, "autoRestart", js.undefined)
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    }
  }
}
