package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.anon.`1`
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.RawStyle
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.RawStyles
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.StyleSheetInstance
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.UserStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleStylesheetMod {
  
  object StyleSheet {
    
    @JSImport("react-sketchapp/lib/module/stylesheet", "StyleSheet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/stylesheet", "StyleSheet.absoluteFill")
    @js.native
    def absoluteFill: Double = js.native
    inline def absoluteFill_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("absoluteFill")(x.asInstanceOf[js.Any])
    
    inline def create(styles: RawStyles): StyleSheetInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleSheetInstance]
    
    inline def flatten(): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[js.UndefOr[Style]]
    inline def flatten(input: js.Array[UserStyle]): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Style]]
    inline def flatten(input: Double): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Style]]
    inline def flatten(input: RawStyle): js.UndefOr[Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Style]]
    
    @JSImport("react-sketchapp/lib/module/stylesheet", "StyleSheet.hairlineWidth")
    @js.native
    def hairlineWidth: Double = js.native
    inline def hairlineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hairlineWidth")(x.asInstanceOf[js.Any])
    
    inline def resolve(style: UserStyle): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[`1`]
  }
}
