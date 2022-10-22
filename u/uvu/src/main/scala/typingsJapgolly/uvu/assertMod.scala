package typingsJapgolly.uvu

import typingsJapgolly.std.Error
import typingsJapgolly.uvu.anon.Actual
import typingsJapgolly.uvu.uvuBooleans.`false`
import typingsJapgolly.uvu.uvuStrings.ERR_ASSERTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  @JSImport("uvu/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uvu/assert", "Assertion")
  @js.native
  open class Assertion ()
    extends StObject
       with Error {
    def this(options: Actual) = this()
    
    var actual: Any = js.native
    
    var code: ERR_ASSERTION = js.native
    
    var details: `false` | String = js.native
    
    var expects: Any = js.native
    
    var generated: Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_Assertion: typingsJapgolly.uvu.uvuStrings.Assertion = js.native
    
    var operator: String = js.native
  }
  
  inline def equal(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fixture(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fixture(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def instance(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def instance(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object is {
    
    inline def apply(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("uvu/assert", "is")
    @js.native
    val ^ : js.Any = js.native
    
    inline def not(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def not(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def `match`(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(actual: String, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(actual: String, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object not {
    
    inline def apply(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(actual: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("uvu/assert", "not")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equal(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def equal(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fixture(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fixture(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def instance(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def instance(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `match`(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `match`(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `match`(actual: String, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `match`(actual: String, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ok(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def ok(actual: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def snapshot(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapshot(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def throws(fn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.Function, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: Unit, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: Message, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `type`(actual: Any, expects: Types): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `type`(actual: Any, expects: Types, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def ok(actual: Any): /* asserts actual */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any]).asInstanceOf[/* asserts actual */ Boolean]
  inline def ok(actual: Any, msg: Message): /* asserts actual */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual */ Boolean]
  
  inline def snapshot(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def snapshot(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throws(fn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.Function, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: Unit, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: Message, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def `type`(actual: Any, expects: Types): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `type`(actual: Any, expects: Types, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unreachable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unreachable")().asInstanceOf[Unit]
  inline def unreachable(msg: Message): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unreachable")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Message = String | js.Error
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.uvu.uvuStrings.string
    - typingsJapgolly.uvu.uvuStrings.number
    - typingsJapgolly.uvu.uvuStrings.boolean
    - typingsJapgolly.uvu.uvuStrings.`object`
    - typingsJapgolly.uvu.uvuStrings.undefined
    - typingsJapgolly.uvu.uvuStrings.function
  */
  trait Types extends StObject
  object Types {
    
    inline def boolean: typingsJapgolly.uvu.uvuStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.uvu.uvuStrings.boolean]
    
    inline def function: typingsJapgolly.uvu.uvuStrings.function = "function".asInstanceOf[typingsJapgolly.uvu.uvuStrings.function]
    
    inline def number: typingsJapgolly.uvu.uvuStrings.number = "number".asInstanceOf[typingsJapgolly.uvu.uvuStrings.number]
    
    inline def `object`: typingsJapgolly.uvu.uvuStrings.`object` = "object".asInstanceOf[typingsJapgolly.uvu.uvuStrings.`object`]
    
    inline def string: typingsJapgolly.uvu.uvuStrings.string = "string".asInstanceOf[typingsJapgolly.uvu.uvuStrings.string]
    
    inline def undefined: typingsJapgolly.uvu.uvuStrings.undefined = "undefined".asInstanceOf[typingsJapgolly.uvu.uvuStrings.undefined]
  }
}
