package typingsJapgolly.jsonMl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json_ml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(xml: String): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  inline def parse(xml: String, trim: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def stringify(`object`: js.Array[Node]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(
    `object`: js.Array[Node],
    replacer: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Cheerio */ /* node */ Any, 
      Any
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    `object`: js.Array[Node],
    replacer: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Cheerio */ /* node */ Any, 
      Any
    ],
    indent: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(`object`: js.Array[Node], replacer: Null, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(`object`: js.Array[Node], replacer: Unit, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Node = String | (Array[String | Any])
}
