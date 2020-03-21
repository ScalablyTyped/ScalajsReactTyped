package typingsJapgolly.antDesignIconsAngular

import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.Renderer2
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularTypesMod.IconDefinition
import typingsJapgolly.antDesignIconsAngular.antDesignIconsAngularTypesMod.ThemeType
import typingsJapgolly.antDesignIconsAngular.iconServiceMod.IconService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular/component/icon.directive", JSImport.Namespace)
@js.native
object iconDirectiveMod extends js.Object {
  @js.native
  class IconDirective protected () extends OnChanges {
    def this(_iconService: IconService, _elementRef: ElementRef[_], _renderer: Renderer2) = this()
    var _elementRef: ElementRef[_] = js.native
    var _iconService: IconService = js.native
    var _renderer: Renderer2 = js.native
    var theme: ThemeType = js.native
    var twoToneColor: String = js.native
    var `type`: String | IconDefinition = js.native
    /**
      * Render a new icon in the current element. Remove the icon when `type` is falsy.
      */
    /* protected */ def _changeIcon(): js.Promise[SVGElement | Null] = js.native
    /* protected */ def _clearSVGElement(): Unit = js.native
    /**
      * Parse a icon to the standard form, an `IconDefinition` or a string like 'account-book-fill` (with a theme suffixed).
      * If namespace is specified, ignore theme because it meaningless for users' icons.
      * @param type
      * @param theme
      */
    /* protected */ def _parseIconType(`type`: String, theme: ThemeType): IconDefinition | String = js.native
    /* protected */ def _parseIconType(`type`: IconDefinition, theme: ThemeType): IconDefinition | String = js.native
    /* protected */ def _setSVGElement(svg: SVGElement): Unit = js.native
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked data-bound properties
      * if at least one has changed, and before the view and content
      * children are checked.
      * @param changes The changed properties.
      */
    /* CompleteClass */
    override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  }
  
}

