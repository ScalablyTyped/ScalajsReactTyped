package typingsJapgolly.webpackSources

import typingsJapgolly.webpackSources.libMod.SourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompatSourceMod {
  
  @JSImport("webpack-sources/lib/CompatSource", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typingsJapgolly.webpackSources.libSourceMod.^ {
    def this(sourceLike: SourceLike) = this()
  }
  @JSImport("webpack-sources/lib/CompatSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def from(sourceLike: SourceLike): typingsJapgolly.webpackSources.libSourceMod.^ | CompatSource = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sourceLike.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.webpackSources.libSourceMod.^ | CompatSource]
  
  type CompatSource = typingsJapgolly.webpackSources.libSourceMod.^
}
