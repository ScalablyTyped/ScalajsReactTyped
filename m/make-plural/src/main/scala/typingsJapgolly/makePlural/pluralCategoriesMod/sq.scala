package typingsJapgolly.makePlural.pluralCategoriesMod

import typingsJapgolly.makePlural.makePluralStrings.many
import typingsJapgolly.makePlural.makePluralStrings.one
import typingsJapgolly.makePlural.makePluralStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sq {
  
  @JSImport("make-plural/pluralCategories", "sq")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "sq.cardinal")
  @js.native
  def cardinal: js.Tuple2[one, other] = js.native
  inline def cardinal_=(x: js.Tuple2[one, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "sq.ordinal")
  @js.native
  def ordinal: js.Tuple3[one, many, other] = js.native
  inline def ordinal_=(x: js.Tuple3[one, many, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
