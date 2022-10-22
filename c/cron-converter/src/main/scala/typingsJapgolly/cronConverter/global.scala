package typingsJapgolly.cronConverter

import typingsJapgolly.cronConverter.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Cron {
    
    @JSGlobal("Cron")
    @js.native
    /**
      * Creates an instance of Cron.
      * Cron objects each represent a cron schedule.
      * @param options The options to use.
      */
    open class ^ ()
      extends typingsJapgolly.cronConverter.mod.^ {
      def this(options: Options) = this()
    }
    
    @JSGlobal("Cron.Seeker")
    @js.native
    open class Seeker protected ()
      extends typingsJapgolly.cronConverter.mod.Seeker {
      /**
        * Creates an instance of Seeker.
        * Seeker objects search for execution times of a cron schedule.
        * @param cron A Cron instance.
        * @param now A Date or Moment object.
        */
      def this(cron: typingsJapgolly.cronConverter.mod.Cron, now: js.Date) = this()
    }
  }
}
