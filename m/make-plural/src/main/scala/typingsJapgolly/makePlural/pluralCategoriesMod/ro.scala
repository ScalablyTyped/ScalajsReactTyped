package typingsJapgolly.makePlural.pluralCategoriesMod

import typingsJapgolly.makePlural.makePluralStrings.few
import typingsJapgolly.makePlural.makePluralStrings.one
import typingsJapgolly.makePlural.makePluralStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ro {
  
  @JSImport("make-plural/pluralCategories", "ro")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "ro.cardinal")
  @js.native
  def cardinal: js.Tuple3[one, few, other] = js.native
  inline def cardinal_=(x: js.Tuple3[one, few, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "ro.ordinal")
  @js.native
  def ordinal: js.Tuple2[one, other] = js.native
  inline def ordinal_=(x: js.Tuple2[one, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
