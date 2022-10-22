package typingsJapgolly.ltx

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ltx.anon.TypeofParser
import typingsJapgolly.ltx.srcParserMod.ParserOptions
import typingsJapgolly.ltx.srcParserMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object libParserMod {
  
  @JSImport("ltx/lib/Parser", JSImport.Namespace)
  @js.native
  open class ^ () extends default {
    def this(options: ParserOptions) = this()
  }
  @JSImport("ltx/lib/Parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ltx/lib/Parser", "DefaultElement")
  @js.native
  def DefaultElement: Instantiable2[
    /* name */ String, 
    /* attrs */ js.UndefOr[String | StringDictionary[Any]], 
    typingsJapgolly.ltx.srcElementMod.default
  ] = js.native
  inline def DefaultElement_=(
    x: Instantiable2[
      /* name */ String, 
      /* attrs */ js.UndefOr[String | StringDictionary[Any]], 
      typingsJapgolly.ltx.srcElementMod.default
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultElement")(x.asInstanceOf[js.Any])
  
  @JSImport("ltx/lib/Parser", "DefaultParser")
  @js.native
  def DefaultParser: TypeofParser = js.native
  inline def DefaultParser_=(x: TypeofParser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultParser")(x.asInstanceOf[js.Any])
}
