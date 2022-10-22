package typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod

import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.plural
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.pound
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.select
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.tag
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MessageFormatElement extends StObject
object _MessageFormatElement {
  
  inline def PluralElement(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.PluralElement]
  }
  
  inline def PoundElement(`type`: pound): typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.PoundElement]
  }
  
  inline def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.SelectElement]
  }
  
  inline def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TagElement]
  }
}
