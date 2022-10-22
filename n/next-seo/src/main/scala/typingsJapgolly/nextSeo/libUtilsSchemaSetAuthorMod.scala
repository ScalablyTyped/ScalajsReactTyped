package typingsJapgolly.nextSeo

import typingsJapgolly.nextSeo.anon.NameType
import typingsJapgolly.nextSeo.anon.Url
import typingsJapgolly.nextSeo.libTypesMod.ArticleAuthor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetAuthorMod {
  
  @JSImport("next-seo/lib/utils/schema/setAuthor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setAuthor(): js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAuthor")().asInstanceOf[js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])]]
  inline def setAuthor(author: String): js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAuthor")(author.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])]]
  inline def setAuthor(author: js.Array[ArticleAuthor | String]): js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAuthor")(author.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])]]
  inline def setAuthor(author: ArticleAuthor): js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAuthor")(author.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Url | NameType | (js.Array[js.UndefOr[Url | NameType]])]]
}
