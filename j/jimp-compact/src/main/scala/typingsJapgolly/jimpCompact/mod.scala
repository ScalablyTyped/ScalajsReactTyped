package typingsJapgolly.jimpCompact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.jimpCompact.anon.Decoders
import typingsJapgolly.jimpCore.typesJimpMod.JimpConstructors
import typingsJapgolly.jimpCore.typesUtilsMod.GetPluginConst
import typingsJapgolly.jimpCore.typesUtilsMod.GetPluginDecoders
import typingsJapgolly.jimpCore.typesUtilsMod.GetPluginEncoders
import typingsJapgolly.jimpCore.typesUtilsMod.GetPluginVal
import typingsJapgolly.jimpCore.typesUtilsMod.UnionToIntersection
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jimp-compact", JSImport.Default)
  @js.native
  val default: JimpConstructors & IntersectedPluginConsts & Decoders = js.native
  
  type IntersectedPluginConsts = UnionToIntersection[GetPluginConst[Plugins | Types]]
  
  type IntersectedPluginDecoders = UnionToIntersection[GetPluginDecoders[Plugins | Types]]
  
  type IntersectedPluginEncoders = UnionToIntersection[GetPluginEncoders[Plugins | Types]]
  
  type IntersectedPluginTypes = UnionToIntersection[GetPluginVal[Plugins | Types]]
  
  type Jimp = typingsJapgolly.jimpCore.typesJimpMod.Jimp & IntersectedPluginTypes
  
  type Plugins = ReturnType[js.Function0[typingsJapgolly.jimpPlugins.mod.Plugins]]
  
  type Types = ReturnType[js.Function0[typingsJapgolly.jimpTypes.mod.Types]]
  
  type _To = JimpConstructors & IntersectedPluginConsts & Decoders
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JimpConstructors & IntersectedPluginConsts & Decoders = default
}
