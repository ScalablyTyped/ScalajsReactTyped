package typingsJapgolly.jupyterlabUiComponents

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jupyterlabUiComponents.anon.IOptionsloadingbooleanund
import typingsJapgolly.jupyterlabUiComponents.anon.Icon
import typingsJapgolly.jupyterlabUiComponents.anon.Ignore
import typingsJapgolly.jupyterlabUiComponents.anon.PartialIResolverPropsIPro
import typingsJapgolly.jupyterlabUiComponents.anon.PartialIResolverPropsIRea
import typingsJapgolly.jupyterlabUiComponents.jupyterlabUiComponentsBooleans.`false`
import typingsJapgolly.jupyterlabUiComponents.libBlueprintMod.CommonProps
import typingsJapgolly.jupyterlabUiComponents.libBlueprintMod.IButtonProps
import typingsJapgolly.jupyterlabUiComponents.libBlueprintMod.IInputGroupProps
import typingsJapgolly.jupyterlabUiComponents.libComponentsHtmlselectMod.IHTMLSelectProps
import typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon.IIcon
import typingsJapgolly.luminoCoreutils.mod.Token
import typingsJapgolly.luminoWidgets.mod.Menu
import typingsJapgolly.luminoWidgets.typesContextmenuMod.ContextMenu.IOptions
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/ui-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Button(props: IButtonProps & CommonProps[Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Button")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Checkbox(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICheckboxProps */ Any) & CommonProps[Any]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Checkbox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ Any) & CommonProps[Any]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Collapse")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object CommandPaletteSvg {
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @JSImport("@jupyterlab/ui-components", "CommandPaletteSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconMod.CommandPaletteSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "CommandPaletteSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsCommandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "ContextMenuSvg")
  @js.native
  open class ContextMenuSvg protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconMod.ContextMenuSvg {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/ui-components", "DEFAULT_STYLE_CLASS")
  @js.native
  val DEFAULT_STYLE_CLASS: /* "jp-DefaultStyle" */ String = js.native
  
  @JSImport("@jupyterlab/ui-components", "DockPanelSvg")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  open class DockPanelSvg ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconMod.DockPanelSvg {
    def this(options: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components", "DockPanelSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconMod.DockPanelSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "FormComponentRegistry")
  @js.native
  open class FormComponentRegistry ()
    extends typingsJapgolly.jupyterlabUiComponents.libFormComponentRegistryMod.FormComponentRegistry
  
  @JSImport("@jupyterlab/ui-components", "HTMLSelect")
  @js.native
  open class HTMLSelect protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libComponentsMod.HTMLSelect {
    def this(props: IHTMLSelectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IHTMLSelectProps, context: Any) = this()
  }
  
  @JSImport("@jupyterlab/ui-components", "HTML_SELECT_CLASS")
  @js.native
  val HTML_SELECT_CLASS: /* "jp-HTMLSelect" */ String = js.native
  
  @JSImport("@jupyterlab/ui-components", "IFormComponentRegistry")
  @js.native
  val IFormComponentRegistry: Token[
    typingsJapgolly.jupyterlabUiComponents.libFormComponentRegistryMod.IFormComponentRegistry
  ] = js.native
  
  @JSImport("@jupyterlab/ui-components", "ILabIconManager")
  @js.native
  val ILabIconManager: Token[typingsJapgolly.jupyterlabUiComponents.libTokensMod.ILabIconManager] = js.native
  
  object IRankedMenu {
    
    /**
      * Default menu item rank
      */
    @JSImport("@jupyterlab/ui-components", "IRankedMenu.DEFAULT_RANK")
    @js.native
    val DEFAULT_RANK: /* 100 */ Double = js.native
  }
  
  inline def InputGroup(props: IInputGroupProps & CommonProps[Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InputGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@jupyterlab/ui-components", "LabIcon")
  @js.native
  open class LabIcon protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconMod.LabIcon {
    /** *********
      * members *
      ***********/
    def this(hasNameSvgstrRenderUnrender_loading: IOptionsloadingbooleanund) = this()
  }
  /* static members */
  object LabIcon {
    
    @JSImport("@jupyterlab/ui-components", "LabIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/ui-components", "LabIcon._debug")
    @js.native
    def _debug: Any = js.native
    inline def _debug_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debug")(x.asInstanceOf[js.Any])
    
    @JSImport("@jupyterlab/ui-components", "LabIcon._instances")
    @js.native
    def _instances: Any = js.native
    inline def _instances_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instances")(x.asInstanceOf[js.Any])
    
    /** *********
      * statics *
      ***********/
    /**
      * Remove any rendered icon from the element that contains it
      *
      * @param container - a DOM node into which an icon was
      * previously rendered
      *
      * @returns the cleaned container
      */
    inline def remove(container: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(container.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into an
      * actual LabIcon.
      *
      * @param icon - either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields.
      *
      * @returns a LabIcon instance
      */
    inline def resolve(hasIcon: Icon): typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hasIcon.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon]
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into a DOM element.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, this function will return
      * an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the element method
      * of the resolved icon on render
      *
      * @returns a DOM node with the resolved icon rendered into it
      */
    inline def resolveElement(hasIconIconClassFallbackProps: PartialIResolverPropsIPro): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveElement")(hasIconIconClassFallbackProps.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /**
      * Resolve an icon name or a {name, svgstr} pair into a React component.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, the returned component
      * will simply render an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the React component
      * of the resolved icon on render
      *
      * @returns a React component that will render the resolved icon
      */
    inline def resolveReact(hasIconIconClassFallbackProps: PartialIResolverPropsIRea): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveReact")(hasIconIconClassFallbackProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Resolve a {name, svgstr} pair into an actual svg node.
      */
    inline def resolveSvg(hasNameSvgstr: IIcon): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSvg")(hasNameSvgstr.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    
    /**
      * Toggle icon debug from off-to-on, or vice-versa.
      *
      * @param debug - optional boolean to force debug on or off
      */
    inline def toggleDebug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDebug")().asInstanceOf[Unit]
    inline def toggleDebug(debug: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDebug")(debug.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/ui-components", "MenuSvg")
  @js.native
  open class MenuSvg protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typingsJapgolly.luminoWidgets.typesMenuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    @JSImport("@jupyterlab/ui-components", "MenuSvg")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components", "MenuSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconMod.MenuSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMenusvgMod.MenuSvg.Renderer = js.native
    
    inline def overrideDefaultRenderer(menu: Menu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideDefaultRenderer")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/ui-components", "RankedMenu")
  @js.native
  open class RankedMenu protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libComponentsMod.RankedMenu {
    /**
      * Construct a new menu.
      *
      * @param options - Options for the lumino menu.
      */
    def this(options: typingsJapgolly.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions) = this()
  }
  
  inline def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ Any) & CommonProps[Any]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Select")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@jupyterlab/ui-components", "Switch")
  @js.native
  open class Switch ()
    extends typingsJapgolly.jupyterlabUiComponents.libComponentsMod.Switch
  
  @JSImport("@jupyterlab/ui-components", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  open class TabBarSvg[T] ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconMod.TabBarSvg[T] {
    def this(options: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components", "TabBarSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconMod.TabBarSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components", "TabPanelSvg")
  @js.native
  /**
    * Construct a new tab panel.
    *
    * @param options - The options for initializing the tab panel.
    */
  open class TabPanelSvg ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconMod.TabPanelSvg {
    def this(options: typingsJapgolly.luminoWidgets.typesTabpanelMod.TabPanel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/ui-components", "addAboveIcon")
  @js.native
  val addAboveIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "addBelowIcon")
  @js.native
  val addBelowIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "addIcon")
  @js.native
  val addIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "badIcon")
  @js.native
  val badIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "blankIcon")
  @js.native
  val blankIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "bugDotIcon")
  @js.native
  val bugDotIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "bugIcon")
  @js.native
  val bugIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "buildIcon")
  @js.native
  val buildIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretDownEmptyIcon")
  @js.native
  val caretDownEmptyIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretDownEmptyThinIcon")
  @js.native
  val caretDownEmptyThinIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretDownIcon")
  @js.native
  val caretDownIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretLeftIcon")
  @js.native
  val caretLeftIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretRightIcon")
  @js.native
  val caretRightIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretUpEmptyThinIcon")
  @js.native
  val caretUpEmptyThinIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caretUpIcon")
  @js.native
  val caretUpIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "caseSensitiveIcon")
  @js.native
  val caseSensitiveIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "checkIcon")
  @js.native
  val checkIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "circleEmptyIcon")
  @js.native
  val circleEmptyIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "circleIcon")
  @js.native
  val circleIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  inline def classesDedupe_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classesDedupe")(classes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classes")(classes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  @JSImport("@jupyterlab/ui-components", "clearIcon")
  @js.native
  val clearIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "closeIcon")
  @js.native
  val closeIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "codeIcon")
  @js.native
  val codeIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "consoleIcon")
  @js.native
  val consoleIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "copyIcon")
  @js.native
  val copyIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "copyrightIcon")
  @js.native
  val copyrightIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "cutIcon")
  @js.native
  val cutIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "deleteIcon")
  @js.native
  val deleteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "downloadIcon")
  @js.native
  val downloadIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "duplicateIcon")
  @js.native
  val duplicateIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "editIcon")
  @js.native
  val editIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "ellipsesIcon")
  @js.native
  val ellipsesIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "extensionIcon")
  @js.native
  val extensionIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "fastForwardIcon")
  @js.native
  val fastForwardIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "fileIcon")
  @js.native
  val fileIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "fileUploadIcon")
  @js.native
  val fileUploadIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "filterListIcon")
  @js.native
  val filterListIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "folderFavoriteIcon")
  @js.native
  val folderFavoriteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "folderIcon")
  @js.native
  val folderIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  inline def getReactAttrs(elem: org.scalajs.dom.Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getReactAttrs")(elem.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getReactAttrs(elem: org.scalajs.dom.Element, hasIgnore: Ignore): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getReactAttrs")(elem.asInstanceOf[js.Any], hasIgnore.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@jupyterlab/ui-components", "homeIcon")
  @js.native
  val homeIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "html5Icon")
  @js.native
  val html5Icon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "imageIcon")
  @js.native
  val imageIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "inspectorIcon")
  @js.native
  val inspectorIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jsonIcon")
  @js.native
  val jsonIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "juliaIcon")
  @js.native
  val juliaIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jupyterFaviconIcon")
  @js.native
  val jupyterFaviconIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jupyterIcon")
  @js.native
  val jupyterIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "jupyterlabWordmarkIcon")
  @js.native
  val jupyterlabWordmarkIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "kernelIcon")
  @js.native
  val kernelIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "keyboardIcon")
  @js.native
  val keyboardIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "launchIcon")
  @js.native
  val launchIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "launcherIcon")
  @js.native
  val launcherIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "lineFormIcon")
  @js.native
  val lineFormIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "linkIcon")
  @js.native
  val linkIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "listIcon")
  @js.native
  val listIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "listingsInfoIcon")
  @js.native
  val listingsInfoIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "markdownIcon")
  @js.native
  val markdownIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "moveDownIcon")
  @js.native
  val moveDownIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "moveUpIcon")
  @js.native
  val moveUpIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "newFolderIcon")
  @js.native
  val newFolderIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "notTrustedIcon")
  @js.native
  val notTrustedIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "notebookIcon")
  @js.native
  val notebookIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "numberingIcon")
  @js.native
  val numberingIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "offlineBoltIcon")
  @js.native
  val offlineBoltIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "paletteIcon")
  @js.native
  val paletteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "pasteIcon")
  @js.native
  val pasteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "pdfIcon")
  @js.native
  val pdfIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "pythonIcon")
  @js.native
  val pythonIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "rKernelIcon")
  @js.native
  val rKernelIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "reactIcon")
  @js.native
  val reactIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "redoIcon")
  @js.native
  val redoIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "refreshIcon")
  @js.native
  val refreshIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "regexIcon")
  @js.native
  val regexIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "runIcon")
  @js.native
  val runIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "runningIcon")
  @js.native
  val runningIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "saveIcon")
  @js.native
  val saveIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "searchIcon")
  @js.native
  val searchIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "settingsIcon")
  @js.native
  val settingsIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "spreadsheetIcon")
  @js.native
  val spreadsheetIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "stopIcon")
  @js.native
  val stopIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "tabIcon")
  @js.native
  val tabIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "tableRowsIcon")
  @js.native
  val tableRowsIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "tagIcon")
  @js.native
  val tagIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "terminalIcon")
  @js.native
  val terminalIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "textEditorIcon")
  @js.native
  val textEditorIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "tocIcon")
  @js.native
  val tocIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "treeViewIcon")
  @js.native
  val treeViewIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "trustedIcon")
  @js.native
  val trustedIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "undoIcon")
  @js.native
  val undoIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "vegaIcon")
  @js.native
  val vegaIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components", "yamlIcon")
  @js.native
  val yamlIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
}
