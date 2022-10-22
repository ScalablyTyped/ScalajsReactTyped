package typingsJapgolly.hastUtilRaw

import typingsJapgolly.hastUtilRaw.complexTypesMod.Raw
import typingsJapgolly.hastUtilRaw.libMod.Node
import typingsJapgolly.hastUtilRaw.libMod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-raw", "raw")
  @js.native
  val raw: (js.Function3[
    /* tree */ Node, 
    /* file */ js.UndefOr[VFile], 
    /* options */ js.UndefOr[typingsJapgolly.hastUtilRaw.libMod.Options], 
    Node
  ]) & (js.Function2[
    /* tree */ Node, 
    /* options */ js.UndefOr[typingsJapgolly.hastUtilRaw.libMod.Options], 
    Node
  ]) = js.native
  
  type Options = typingsJapgolly.hastUtilRaw.libMod.Options
  
  type Raw_ = Raw
}
