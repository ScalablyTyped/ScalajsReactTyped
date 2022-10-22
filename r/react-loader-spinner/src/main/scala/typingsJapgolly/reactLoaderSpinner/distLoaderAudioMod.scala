package typingsJapgolly.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderAudioMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/Audio", JSImport.Default)
  @js.native
  val default: FunctionComponent[AudioProps] = js.native
  
  type AudioProps = BaseProps
  
  type _To = FunctionComponent[AudioProps]
  
  /* This means you don't have to write `default`, but can instead just say `distLoaderAudioMod.foo` */
  override def _to: FunctionComponent[AudioProps] = default
}
