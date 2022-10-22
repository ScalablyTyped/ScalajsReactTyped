package typingsJapgolly.jupyterlabSharedModels.libApiMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabNbformat.mod.ILanguageInfoMetadata
import typingsJapgolly.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedLanguageInfoMetadata
  extends StObject
     with ILanguageInfoMetadata
     with IDisposable
object ISharedLanguageInfoMetadata {
  
  inline def apply(dispose: Callback, isDisposed: Boolean, name: String): ISharedLanguageInfoMetadata = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, isDisposed = isDisposed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedLanguageInfoMetadata]
  }
}
