package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Cols
import typingsJapgolly.materialUiCore.materialUiCoreStrings.li
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListTileGridListTileMod extends Shortcut {
  
  /**
    * ⚠️ The GridList component was renamed to ImageList to align with the current Material Design naming.
    *
    * You should use `import { ImageListItem } from '@material-ui/core'`
    * or `import ImageListItem from '@material-ui/core/ImageListItem'`.
    * API:
    *
    * - [GridListTile API](https://mui.com/api/grid-list-tile/)
    */
  @JSImport("@material-ui/core/GridListTile/GridListTile", JSImport.Default)
  @js.native
  val default: OverridableComponent[GridListTileTypeMap[js.Object, li]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.tile
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullHeight
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullWidth
  */
  trait GridListTileClassKey extends StObject
  object GridListTileClassKey {
    
    inline def imgFullHeight: typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullHeight = "imgFullHeight".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullHeight]
    
    inline def imgFullWidth: typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullWidth = "imgFullWidth".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullWidth]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def tile: typingsJapgolly.materialUiCore.materialUiCoreStrings.tile = "tile".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.tile]
  }
  
  type GridListTileProps[D /* <: ElementType */, P] = OverrideProps[GridListTileTypeMap[P, D], D]
  
  trait GridListTileTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: GridListTileClassKey
    
    var defaultComponent: D
    
    var props: P & Cols
  }
  object GridListTileTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: GridListTileClassKey, defaultComponent: D, props: P & Cols): GridListTileTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridListTileTypeMap[P, D]]
    }
    
    extension [Self <: GridListTileTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (GridListTileTypeMap[P, D])) {
      
      inline def setClassKey(value: GridListTileClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Cols): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[GridListTileTypeMap[js.Object, li]]
  
  /* This means you don't have to write `default`, but can instead just say `gridListTileGridListTileMod.foo` */
  override def _to: OverridableComponent[GridListTileTypeMap[js.Object, li]] = default
}
