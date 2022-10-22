package typingsJapgolly.makePlural.pluralCategoriesMod

import typingsJapgolly.makePlural.makePluralStrings.few
import typingsJapgolly.makePlural.makePluralStrings.many
import typingsJapgolly.makePlural.makePluralStrings.one
import typingsJapgolly.makePlural.makePluralStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sk {
  
  @JSImport("make-plural/pluralCategories", "sk")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "sk.cardinal")
  @js.native
  def cardinal: js.Tuple4[one, few, many, other] = js.native
  inline def cardinal_=(x: js.Tuple4[one, few, many, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "sk.ordinal")
  @js.native
  def ordinal: js.Array[other] = js.native
  inline def ordinal_=(x: js.Array[other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
