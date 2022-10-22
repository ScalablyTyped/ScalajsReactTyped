package typingsJapgolly.jsonlines

import typingsJapgolly.jsonlines.jsonlinesStrings.`invalid-line`
import typingsJapgolly.jsonlines.jsonlinesStrings.close
import typingsJapgolly.jsonlines.jsonlinesStrings.data
import typingsJapgolly.jsonlines.jsonlinesStrings.end
import typingsJapgolly.jsonlines.jsonlinesStrings.error
import typingsJapgolly.jsonlines.jsonlinesStrings.pause
import typingsJapgolly.jsonlines.jsonlinesStrings.readable
import typingsJapgolly.jsonlines.jsonlinesStrings.resume
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonlines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsonlines", "Parser")
  @js.native
  open class Parser () extends Transform {
    def this(opts: TransformOptions) = this()
    
    // inherited (must re-declare since this is a class)
    def on(event: close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    // added 'invalid-line'
    def on(event: error | `invalid-line`, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    // inherited
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    // changed
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
  }
  
  @JSImport("jsonlines", "Stringifier")
  @js.native
  open class Stringifier () extends Transform {
    def this(opts: TransformOptions) = this()
    
    // inherited (must re-declare since this is a class)
    def on(event: close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    // inherited
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    // changed
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  }
  
  inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
  inline def parse(options: Options): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
  
  inline def stringify(): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Stringifier]
  
  trait Options extends StObject {
    
    var emitInvalidLines: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEmitInvalidLines(value: Boolean): Self = StObject.set(x, "emitInvalidLines", value.asInstanceOf[js.Any])
      
      inline def setEmitInvalidLinesUndefined: Self = StObject.set(x, "emitInvalidLines", js.undefined)
    }
  }
}
