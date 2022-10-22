package typingsJapgolly.htmlhint

import japgolly.scalajs.react.Callback
import typingsJapgolly.htmlhint.typesMod.Hint
import typingsJapgolly.htmlhint.typesMod.ReportType
import typingsJapgolly.htmlhint.typesMod.Rule
import typingsJapgolly.htmlhint.typesMod.Ruleset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod {
  
  @JSImport("htmlhint/reporter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Reporter {
    def this(html: String, ruleset: Ruleset) = this()
    
    /* CompleteClass */
    var brLen: Double = js.native
    
    /* CompleteClass */
    override def error(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
    
    /* CompleteClass */
    var html: String = js.native
    
    /* CompleteClass */
    override def info(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
    
    /* CompleteClass */
    var lines: js.Array[String] = js.native
    
    /* CompleteClass */
    var messages: js.Array[Hint] = js.native
    
    /* private */ /* CompleteClass */
    override def report(`type`: ReportType, message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
    
    /* CompleteClass */
    var ruleset: Ruleset = js.native
    
    /* CompleteClass */
    override def warn(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
  }
  
  trait Reporter extends StObject {
    
    var brLen: Double
    
    def error(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
    
    var html: String
    
    def info(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
    
    var lines: js.Array[String]
    
    var messages: js.Array[Hint]
    
    /* private */ def report(`type`: ReportType, message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
    
    var ruleset: Ruleset
    
    def warn(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
  }
  object Reporter {
    
    inline def apply(
      brLen: Double,
      error: (String, Double, Double, Rule, String) => Callback,
      html: String,
      info: (String, Double, Double, Rule, String) => Callback,
      lines: js.Array[String],
      messages: js.Array[Hint],
      report: (ReportType, String, Double, Double, Rule, String) => Callback,
      ruleset: Ruleset,
      warn: (String, Double, Double, Rule, String) => Callback
    ): Reporter = {
      val __obj = js.Dynamic.literal(brLen = brLen.asInstanceOf[js.Any], error = js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Rule, t4: String) => (error(t0, t1, t2, t3, t4)).runNow()), html = html.asInstanceOf[js.Any], info = js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Rule, t4: String) => (info(t0, t1, t2, t3, t4)).runNow()), lines = lines.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], report = js.Any.fromFunction6((t0: ReportType, t1: String, t2: Double, t3: Double, t4: Rule, t5: String) => (report(t0, t1, t2, t3, t4, t5)).runNow()), ruleset = ruleset.asInstanceOf[js.Any], warn = js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Rule, t4: String) => (warn(t0, t1, t2, t3, t4)).runNow()))
      __obj.asInstanceOf[Reporter]
    }
    
    extension [Self <: Reporter](x: Self) {
      
      inline def setBrLen(value: Double): Self = StObject.set(x, "brLen", value.asInstanceOf[js.Any])
      
      inline def setError(value: (String, Double, Double, Rule, String) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Rule, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: (String, Double, Double, Rule, String) => Callback): Self = StObject.set(x, "info", js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Rule, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setMessages(value: js.Array[Hint]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: Hint*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setReport(value: (ReportType, String, Double, Double, Rule, String) => Callback): Self = StObject.set(x, "report", js.Any.fromFunction6((t0: ReportType, t1: String, t2: Double, t3: Double, t4: Rule, t5: String) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setRuleset(value: Ruleset): Self = StObject.set(x, "ruleset", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: (String, Double, Double, Rule, String) => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Rule, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    }
  }
}
