package typingsJapgolly.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`10`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`11`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`12`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`2`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`3`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`4`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`5`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`6`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`7`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`8`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`9`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.ancestor
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.child
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.parent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsTileMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/tile", JSImport.Default)
  @js.native
  val default: BulmaComponent[TileProps, div] = js.native
  
  trait TileProps extends StObject {
    
    var kind: js.UndefOr[ancestor | parent | child] = js.undefined
    
    var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object TileProps {
    
    inline def apply(): TileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileProps]
    }
    
    extension [Self <: TileProps](x: Self) {
      
      inline def setKind(value: ancestor | parent | child): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = BulmaComponent[TileProps, div]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsTileMod.foo` */
  override def _to: BulmaComponent[TileProps, div] = default
}
