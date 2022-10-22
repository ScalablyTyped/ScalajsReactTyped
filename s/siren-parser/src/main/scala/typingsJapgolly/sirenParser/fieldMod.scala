package typingsJapgolly.sirenParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod {
  
  @JSImport("siren-parser/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(field: js.Object): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(field.asInstanceOf[js.Any]).asInstanceOf[Field]
  
  @js.native
  sealed trait FieldType extends StObject
  @JSImport("siren-parser/Field", "FieldType")
  @js.native
  object FieldType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FieldType & String] = js.native
    
    @js.native
    sealed trait Checkbox
      extends StObject
         with FieldType
    /* "checkbox" */ val Checkbox: typingsJapgolly.sirenParser.fieldMod.FieldType.Checkbox & String = js.native
    
    @js.native
    sealed trait Color
      extends StObject
         with FieldType
    /* "color" */ val Color: typingsJapgolly.sirenParser.fieldMod.FieldType.Color & String = js.native
    
    @js.native
    sealed trait Date
      extends StObject
         with FieldType
    /* "date" */ val Date: typingsJapgolly.sirenParser.fieldMod.FieldType.Date & String = js.native
    
    @js.native
    sealed trait DateTime
      extends StObject
         with FieldType
    /* "datetime" */ val DateTime: typingsJapgolly.sirenParser.fieldMod.FieldType.DateTime & String = js.native
    
    @js.native
    sealed trait Email
      extends StObject
         with FieldType
    /* "email" */ val Email: typingsJapgolly.sirenParser.fieldMod.FieldType.Email & String = js.native
    
    @js.native
    sealed trait File
      extends StObject
         with FieldType
    /* "file" */ val File: typingsJapgolly.sirenParser.fieldMod.FieldType.File & String = js.native
    
    @js.native
    sealed trait Hidden
      extends StObject
         with FieldType
    /* "hidden" */ val Hidden: typingsJapgolly.sirenParser.fieldMod.FieldType.Hidden & String = js.native
    
    @js.native
    sealed trait LocalDateTime
      extends StObject
         with FieldType
    /* "datetime-local" */ val LocalDateTime: typingsJapgolly.sirenParser.fieldMod.FieldType.LocalDateTime & String = js.native
    
    @js.native
    sealed trait Month
      extends StObject
         with FieldType
    /* "month" */ val Month: typingsJapgolly.sirenParser.fieldMod.FieldType.Month & String = js.native
    
    @js.native
    sealed trait Number
      extends StObject
         with FieldType
    /* "number" */ val Number: typingsJapgolly.sirenParser.fieldMod.FieldType.Number & String = js.native
    
    @js.native
    sealed trait Password
      extends StObject
         with FieldType
    /* "password" */ val Password: typingsJapgolly.sirenParser.fieldMod.FieldType.Password & String = js.native
    
    @js.native
    sealed trait Radio
      extends StObject
         with FieldType
    /* "radio" */ val Radio: typingsJapgolly.sirenParser.fieldMod.FieldType.Radio & String = js.native
    
    @js.native
    sealed trait Range
      extends StObject
         with FieldType
    /* "range" */ val Range: typingsJapgolly.sirenParser.fieldMod.FieldType.Range & String = js.native
    
    @js.native
    sealed trait Search
      extends StObject
         with FieldType
    /* "search" */ val Search: typingsJapgolly.sirenParser.fieldMod.FieldType.Search & String = js.native
    
    @js.native
    sealed trait Telephone
      extends StObject
         with FieldType
    /* "tel" */ val Telephone: typingsJapgolly.sirenParser.fieldMod.FieldType.Telephone & String = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with FieldType
    /* "text" */ val Text: typingsJapgolly.sirenParser.fieldMod.FieldType.Text & String = js.native
    
    @js.native
    sealed trait Time
      extends StObject
         with FieldType
    /* "time" */ val Time: typingsJapgolly.sirenParser.fieldMod.FieldType.Time & String = js.native
    
    @js.native
    sealed trait Url
      extends StObject
         with FieldType
    /* "url" */ val Url: typingsJapgolly.sirenParser.fieldMod.FieldType.Url & String = js.native
    
    @js.native
    sealed trait Week
      extends StObject
         with FieldType
    /* "week" */ val Week: typingsJapgolly.sirenParser.fieldMod.FieldType.Week & String = js.native
  }
  
  @js.native
  trait Field extends StObject {
    
    var `class`: js.UndefOr[js.Array[String]] = js.native
    
    def hasClass(cls: String): Boolean = js.native
    def hasClass(cls: js.RegExp): Boolean = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: String = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[FieldType] = js.native
    
    var value: js.UndefOr[Any] = js.native
  }
}
