package typingsJapgolly.antDesignIconsReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.antDesignIconsReact.esUtilsMod.MiniMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsIconMod {
  
  @JSImport("@ant-design/icons-react/es/components/Icon", JSImport.Default)
  @js.native
  open class default () extends Icon
  object default {
    
    @JSImport("@ant-design/icons-react/es/components/Icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def add(
      icons: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any)*
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(icons.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /* static member */
    @JSImport("@ant-design/icons-react/es/components/Icon", "default.definitions")
    @js.native
    def definitions: MiniMap[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = js.native
    inline def definitions_=(
      x: MiniMap[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/icons-react/es/components/Icon", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def get(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    inline def get(key: String): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    inline def get(key: String, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    inline def get(key: Unit, colors: TwoToneColorPalette): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any
      ]]
    
    /* static member */
    inline def getTwoToneColors(): TwoToneColorPalette = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColors")().asInstanceOf[TwoToneColorPalette]
    
    /* static member */
    inline def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColors")(hasPrimaryColorSecondaryColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait Icon
    extends Component[IconProps, js.Object, Any]
  
  trait IconProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var focusable: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var secondaryColor: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any)
  }
  object IconProps {
    
    inline def apply(
      `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any)
    ): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFocusable(value: String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[SVGSVGElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[SVGSVGElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwoToneColorPalette
    extends StObject
       with TwoToneColorPaletteSetter {
    
    @JSName("secondaryColor")
    var secondaryColor_TwoToneColorPalette: String
  }
  object TwoToneColorPalette {
    
    inline def apply(primaryColor: String, secondaryColor: String): TwoToneColorPalette = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPalette]
    }
    
    extension [Self <: TwoToneColorPalette](x: Self) {
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String
    
    var secondaryColor: js.UndefOr[String] = js.undefined
  }
  object TwoToneColorPaletteSetter {
    
    inline def apply(primaryColor: String): TwoToneColorPaletteSetter = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPaletteSetter]
    }
    
    extension [Self <: TwoToneColorPaletteSetter](x: Self) {
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
}
