package typingsJapgolly.globalize

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cldrjs.mod.CldrStatic
import typingsJapgolly.globalize.distGlobalizeMod.Shared
import typingsJapgolly.globalize.distGlobalizeMod.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGlobalizeMessageMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/message", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/message", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Shared {
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(cldr: CldrStatic) = this()
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(locale: String) = this()
  }
  
  type _To = js.Object & Static
  
  /* This means you don't have to write `^`, but can instead just say `distGlobalizeMessageMod.foo` */
  override def _to: js.Object & Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    @js.native
    trait Shared extends StObject {
      
      /**
        * Formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string
        * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
        * @param variables Variables can be Objects, where each property can be referenced by name inside a message; or Arrays, where each entry of the Array can be used inside a message, using numeric indices. When passing one or more arguments of other types, they're converted to an Array and used as such.
        * @returns {string} Return a user-readable string.
        */
      def formatMessage(path: String): String = js.native
      def formatMessage(path: String, variables: String): String = js.native
      def formatMessage(path: String, variables: js.Array[String]): String = js.native
      def formatMessage(path: String, variables: js.Object): String = js.native
      def formatMessage(path: js.Array[String]): String = js.native
      def formatMessage(path: js.Array[String], variables: String): String = js.native
      def formatMessage(path: js.Array[String], variables: js.Array[String]): String = js.native
      def formatMessage(path: js.Array[String], variables: js.Object): String = js.native
      
      /**
        * Return a function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
        * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
        * @returns {Function} Return A function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
        */
      def messageFormatter(path: String): js.Function1[/* variables */ js.UndefOr[String | js.Array[String] | js.Object], String] = js.native
      def messageFormatter(path: js.Array[String]): js.Function1[/* variables */ js.UndefOr[String | js.Array[String] | js.Object], String] = js.native
    }
    
    trait Static extends StObject {
      
      /**
        * Load messages data.
        * @param {Object} json JSON object of messages data. Keys can use any character, except /, { and }. Values (i.e., the message content itself) can contain any character.
        * @returns {void}
        */
      def loadMessages(json: js.Object): Unit
    }
    object Static {
      
      inline def apply(loadMessages: js.Object => Callback): typingsJapgolly.globalize.distGlobalizeMessageMod.globalizeDistGlobalizeAugmentingMod.Static = {
        val __obj = js.Dynamic.literal(loadMessages = js.Any.fromFunction1((t0: js.Object) => loadMessages(t0).runNow()))
        __obj.asInstanceOf[typingsJapgolly.globalize.distGlobalizeMessageMod.globalizeDistGlobalizeAugmentingMod.Static]
      }
      
      extension [Self <: typingsJapgolly.globalize.distGlobalizeMessageMod.globalizeDistGlobalizeAugmentingMod.Static](x: Self) {
        
        inline def setLoadMessages(value: js.Object => Callback): Self = StObject.set(x, "loadMessages", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      }
    }
  }
}
