package typingsJapgolly.jestWatcher

import typingsJapgolly.jestWatcher.baseWatchPluginMod.default
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-watcher/build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BaseWatchPlugin protected () extends default {
    def this(hasStdinStdout: AnonStdin) = this()
  }
  
  @js.native
  class JestHook ()
    extends typingsJapgolly.jestWatcher.jestHooksMod.default
  
  @js.native
  class PatternPrompt protected ()
    extends typingsJapgolly.jestWatcher.patternPromptMod.default {
    def this(pipe: WritableStream, prompt: typingsJapgolly.jestWatcher.promptMod.default) = this()
  }
  
  @js.native
  class Prompt ()
    extends typingsJapgolly.jestWatcher.promptMod.default
  
  def printPatternCaret(pattern: String, pipe: WritableStream): Unit = js.native
  def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = js.native
  @js.native
  object KEYS extends js.Object {
    var ARROW_DOWN: String = js.native
    var ARROW_LEFT: String = js.native
    var ARROW_RIGHT: String = js.native
    var ARROW_UP: String = js.native
    var BACKSPACE: String = js.native
    var CONTROL_C: String = js.native
    var CONTROL_D: String = js.native
    var ENTER: String = js.native
    var ESCAPE: String = js.native
  }
  
}

