package typingsJapgolly.makePlural.pluralCategoriesMod

import typingsJapgolly.makePlural.makePluralStrings.few
import typingsJapgolly.makePlural.makePluralStrings.many
import typingsJapgolly.makePlural.makePluralStrings.one
import typingsJapgolly.makePlural.makePluralStrings.other
import typingsJapgolly.makePlural.makePluralStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gv {
  
  @JSImport("make-plural/pluralCategories", "gv")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "gv.cardinal")
  @js.native
  def cardinal: js.Tuple5[one, two, few, many, other] = js.native
  inline def cardinal_=(x: js.Tuple5[one, two, few, many, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "gv.ordinal")
  @js.native
  def ordinal: js.Array[other] = js.native
  inline def ordinal_=(x: js.Array[other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
