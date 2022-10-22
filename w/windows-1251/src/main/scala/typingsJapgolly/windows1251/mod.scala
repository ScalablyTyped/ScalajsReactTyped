package typingsJapgolly.windows1251

import typingsJapgolly.windows1251.anon.Mode
import typingsJapgolly.windows1251.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-1251", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(text: String, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(input: String, options: Mode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("windows-1251", "labels")
  @js.native
  def labels: js.Array[String] = js.native
  inline def labels_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
  
  @JSImport("windows-1251", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.windows1251.windows1251Strings.replacement
    - typingsJapgolly.windows1251.windows1251Strings.fatal
  */
  trait DecoderMode extends StObject
  object DecoderMode {
    
    inline def fatal: typingsJapgolly.windows1251.windows1251Strings.fatal = "fatal".asInstanceOf[typingsJapgolly.windows1251.windows1251Strings.fatal]
    
    inline def replacement: typingsJapgolly.windows1251.windows1251Strings.replacement = "replacement".asInstanceOf[typingsJapgolly.windows1251.windows1251Strings.replacement]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.windows1251.windows1251Strings.fatal
    - typingsJapgolly.windows1251.windows1251Strings.html
  */
  trait EncoderMode extends StObject
  object EncoderMode {
    
    inline def fatal: typingsJapgolly.windows1251.windows1251Strings.fatal = "fatal".asInstanceOf[typingsJapgolly.windows1251.windows1251Strings.fatal]
    
    inline def html: typingsJapgolly.windows1251.windows1251Strings.html = "html".asInstanceOf[typingsJapgolly.windows1251.windows1251Strings.html]
  }
  
  @js.native
  trait windows1251 extends StObject {
    
    def decode(text: String): String = js.native
    def decode(text: String, options: `0`): String = js.native
    
    def encode(input: String): String = js.native
    def encode(input: String, options: Mode): String = js.native
  }
}
