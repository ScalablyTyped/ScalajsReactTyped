package typingsJapgolly.vueI18n.anon

import typingsJapgolly.intlifyCoreBase.mod.RemoveIndexSignature
import typingsJapgolly.vueI18n.mod.DefaultDateTimeFormatSchema
import typingsJapgolly.vueI18n.mod.DefaultLocaleMessageSchema
import typingsJapgolly.vueI18n.mod.DefaultNumberFormatSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datetime extends StObject {
  
  var datetime: DefaultDateTimeFormatSchema[js.Object]
  
  var message: DefaultLocaleMessageSchema[
    RemoveIndexSignature[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
    ]
  ]
  
  var number: DefaultNumberFormatSchema[js.Object]
}
object Datetime {
  
  inline def apply(
    datetime: DefaultDateTimeFormatSchema[js.Object],
    message: DefaultLocaleMessageSchema[
      RemoveIndexSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
      ]
    ],
    number: DefaultNumberFormatSchema[js.Object]
  ): Datetime = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datetime]
  }
  
  extension [Self <: Datetime](x: Self) {
    
    inline def setDatetime(value: DefaultDateTimeFormatSchema[js.Object]): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setMessage(
      value: DefaultLocaleMessageSchema[
          RemoveIndexSignature[
            /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: DefaultNumberFormatSchema[js.Object]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
