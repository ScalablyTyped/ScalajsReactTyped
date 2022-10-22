package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceOptionType extends StObject
@JSImport("azdata", "ServiceOptionType")
@js.native
object ServiceOptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ServiceOptionType & String] = js.native
  
  @js.native
  sealed trait boolean
    extends StObject
       with ServiceOptionType
  /* "boolean" */ val boolean: typingsJapgolly.azdata.mod.ServiceOptionType.boolean & String = js.native
  
  @js.native
  sealed trait category
    extends StObject
       with ServiceOptionType
  /* "category" */ val category: typingsJapgolly.azdata.mod.ServiceOptionType.category & String = js.native
  
  @js.native
  sealed trait multistring
    extends StObject
       with ServiceOptionType
  /* "multistring" */ val multistring: typingsJapgolly.azdata.mod.ServiceOptionType.multistring & String = js.native
  
  @js.native
  sealed trait number
    extends StObject
       with ServiceOptionType
  /* "number" */ val number: typingsJapgolly.azdata.mod.ServiceOptionType.number & String = js.native
  
  @js.native
  sealed trait `object`
    extends StObject
       with ServiceOptionType
  /* "object" */ val `object`: typingsJapgolly.azdata.mod.ServiceOptionType.`object` & String = js.native
  
  @js.native
  sealed trait password
    extends StObject
       with ServiceOptionType
  /* "password" */ val password: typingsJapgolly.azdata.mod.ServiceOptionType.password & String = js.native
  
  @js.native
  sealed trait string
    extends StObject
       with ServiceOptionType
  /* "string" */ val string: typingsJapgolly.azdata.mod.ServiceOptionType.string & String = js.native
}
