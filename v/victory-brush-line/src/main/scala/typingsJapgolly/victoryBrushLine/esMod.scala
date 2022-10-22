package typingsJapgolly.victoryBrushLine

import typingsJapgolly.victoryBrushLine.anon.AllowDrag
import typingsJapgolly.victoryBrushLine.anon.AllowDraw
import typingsJapgolly.victoryBrushLine.anon.EventHandlers
import typingsJapgolly.victoryBrushLine.esVictoryBrushLineMod.VictoryBrushLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-brush-line/es", "VictoryBrushLine")
  @js.native
  open class VictoryBrushLine protected ()
    extends typingsJapgolly.victoryBrushLine.esVictoryBrushLineMod.VictoryBrushLine {
    def this(props: VictoryBrushLineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryBrushLineProps, context: Any) = this()
  }
  /* static members */
  object VictoryBrushLine {
    
    @JSImport("victory-brush-line/es", "VictoryBrushLine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultEvents(props: Any): js.UndefOr[js.Array[EventHandlers]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultEvents")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[EventHandlers]]]
    
    @JSImport("victory-brush-line/es", "VictoryBrushLine.defaultProps")
    @js.native
    def defaultProps: AllowDraw = js.native
    inline def defaultProps_=(x: AllowDraw): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-brush-line/es", "VictoryBrushLine.propTypes")
    @js.native
    def propTypes: AllowDrag = js.native
    inline def propTypes_=(x: AllowDrag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
