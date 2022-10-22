package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorStringIsIPMod.IsIpVersion
import typingsJapgolly.classValidator.typesDecoratorStringIsISBNMod.IsISBNVersion
import typingsJapgolly.classValidator.typesDecoratorStringIsUUIDMod.UUIDVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classValidatorStrings {
  
  @js.native
  sealed trait `10`
    extends StObject
       with IsISBNVersion
  inline def `10`: `10` = "10".asInstanceOf[`10`]
  
  @js.native
  sealed trait `13`
    extends StObject
       with IsISBNVersion
  inline def `13`: `13` = "13".asInstanceOf[`13`]
  
  @js.native
  sealed trait `3`
    extends StObject
       with UUIDVersion
  inline def `3`: `3` = "3".asInstanceOf[`3`]
  
  @js.native
  sealed trait `4`
    extends StObject
       with IsIpVersion
       with UUIDVersion
  inline def `4`: `4` = "4".asInstanceOf[`4`]
  
  @js.native
  sealed trait `5`
    extends StObject
       with UUIDVersion
  inline def `5`: `5` = "5".asInstanceOf[`5`]
  
  @js.native
  sealed trait `6`
    extends StObject
       with IsIpVersion
  inline def `6`: `6` = "6".asInstanceOf[`6`]
  
  @js.native
  sealed trait all
    extends StObject
       with UUIDVersion
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
}
