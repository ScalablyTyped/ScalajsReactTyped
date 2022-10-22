package typingsJapgolly.victoryLine

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.react.mod.FC
import typingsJapgolly.victoryLine.anon.AddGlobalListener
import typingsJapgolly.victoryLine.anon.Instantiable
import typingsJapgolly.victoryLine.anon.TypeofVictoryLineBase
import typingsJapgolly.victoryLine.esCurveMod.CurveProps
import typingsJapgolly.victoryLine.esVictoryLineMod.VictoryLineBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-line/es", "Curve")
  @js.native
  val Curve: FC[CurveProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-line/es", "VictoryLine")
  @js.native
  open class VictoryLine protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-line/es", "VictoryLine")
  @js.native
  val VictoryLine: Instantiable & TypeofVictoryLineBase & (Instantiable1[/* props */ Any, VictoryLineBase]) = js.native
}
