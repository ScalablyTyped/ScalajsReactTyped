package typingsJapgolly.jupyterlabUiComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.jupyterlabUiComponents.anon.IOptionsloadingbooleanund
import typingsJapgolly.jupyterlabUiComponents.anon.Icon
import typingsJapgolly.jupyterlabUiComponents.anon.PartialIResolverPropsIPro
import typingsJapgolly.jupyterlabUiComponents.anon.PartialIResolverPropsIRea
import typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon.IIcon
import typingsJapgolly.luminoWidgets.mod.Menu
import typingsJapgolly.luminoWidgets.typesContextmenuMod.ContextMenu.IOptions
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconMod {
  
  object CommandPaletteSvg {
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "CommandPaletteSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.CommandPaletteSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "CommandPaletteSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsCommandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "ContextMenuSvg")
  @js.native
  open class ContextMenuSvg protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.ContextMenuSvg {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "DockPanelSvg")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  open class DockPanelSvg ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.DockPanelSvg {
    def this(options: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "DockPanelSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.DockPanelSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon")
  @js.native
  open class LabIcon protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon {
    /** *********
      * members *
      ***********/
    def this(hasNameSvgstrRenderUnrender_loading: IOptionsloadingbooleanund) = this()
  }
  /* static members */
  object LabIcon {
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon._debug")
    @js.native
    def _debug: Any = js.native
    inline def _debug_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debug")(x.asInstanceOf[js.Any])
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon._instances")
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
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg")
  @js.native
  open class MenuSvg protected ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typingsJapgolly.luminoWidgets.typesMenuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.MenuSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMenusvgMod.MenuSvg.Renderer = js.native
    
    inline def overrideDefaultRenderer(menu: Menu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideDefaultRenderer")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  open class TabBarSvg[T] ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.TabBarSvg[T] {
    def this(options: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "TabBarSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.TabBarSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "TabPanelSvg")
  @js.native
  /**
    * Construct a new tab panel.
    *
    * @param options - The options for initializing the tab panel.
    */
  open class TabPanelSvg ()
    extends typingsJapgolly.jupyterlabUiComponents.libIconWidgetsMod.TabPanelSvg {
    def this(options: typingsJapgolly.luminoWidgets.typesTabpanelMod.TabPanel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "addAboveIcon")
  @js.native
  val addAboveIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "addBelowIcon")
  @js.native
  val addBelowIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "addIcon")
  @js.native
  val addIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "badIcon")
  @js.native
  val badIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "blankIcon")
  @js.native
  val blankIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "bugDotIcon")
  @js.native
  val bugDotIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "bugIcon")
  @js.native
  val bugIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "buildIcon")
  @js.native
  val buildIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretDownEmptyIcon")
  @js.native
  val caretDownEmptyIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretDownEmptyThinIcon")
  @js.native
  val caretDownEmptyThinIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretDownIcon")
  @js.native
  val caretDownIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretLeftIcon")
  @js.native
  val caretLeftIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretRightIcon")
  @js.native
  val caretRightIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretUpEmptyThinIcon")
  @js.native
  val caretUpEmptyThinIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretUpIcon")
  @js.native
  val caretUpIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caseSensitiveIcon")
  @js.native
  val caseSensitiveIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "checkIcon")
  @js.native
  val checkIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "circleEmptyIcon")
  @js.native
  val circleEmptyIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "circleIcon")
  @js.native
  val circleIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "clearIcon")
  @js.native
  val clearIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "closeIcon")
  @js.native
  val closeIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "codeIcon")
  @js.native
  val codeIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "consoleIcon")
  @js.native
  val consoleIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "copyIcon")
  @js.native
  val copyIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "copyrightIcon")
  @js.native
  val copyrightIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "cutIcon")
  @js.native
  val cutIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "deleteIcon")
  @js.native
  val deleteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "downloadIcon")
  @js.native
  val downloadIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "duplicateIcon")
  @js.native
  val duplicateIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "editIcon")
  @js.native
  val editIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "ellipsesIcon")
  @js.native
  val ellipsesIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "extensionIcon")
  @js.native
  val extensionIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "fastForwardIcon")
  @js.native
  val fastForwardIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "fileIcon")
  @js.native
  val fileIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "fileUploadIcon")
  @js.native
  val fileUploadIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "filterListIcon")
  @js.native
  val filterListIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "folderFavoriteIcon")
  @js.native
  val folderFavoriteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "folderIcon")
  @js.native
  val folderIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "homeIcon")
  @js.native
  val homeIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "html5Icon")
  @js.native
  val html5Icon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "imageIcon")
  @js.native
  val imageIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "inspectorIcon")
  @js.native
  val inspectorIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jsonIcon")
  @js.native
  val jsonIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "juliaIcon")
  @js.native
  val juliaIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jupyterFaviconIcon")
  @js.native
  val jupyterFaviconIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jupyterIcon")
  @js.native
  val jupyterIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jupyterlabWordmarkIcon")
  @js.native
  val jupyterlabWordmarkIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "kernelIcon")
  @js.native
  val kernelIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "keyboardIcon")
  @js.native
  val keyboardIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "launchIcon")
  @js.native
  val launchIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "launcherIcon")
  @js.native
  val launcherIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "lineFormIcon")
  @js.native
  val lineFormIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "linkIcon")
  @js.native
  val linkIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "listIcon")
  @js.native
  val listIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "listingsInfoIcon")
  @js.native
  val listingsInfoIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "markdownIcon")
  @js.native
  val markdownIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "moveDownIcon")
  @js.native
  val moveDownIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "moveUpIcon")
  @js.native
  val moveUpIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "newFolderIcon")
  @js.native
  val newFolderIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "notTrustedIcon")
  @js.native
  val notTrustedIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "notebookIcon")
  @js.native
  val notebookIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "numberingIcon")
  @js.native
  val numberingIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "offlineBoltIcon")
  @js.native
  val offlineBoltIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "paletteIcon")
  @js.native
  val paletteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "pasteIcon")
  @js.native
  val pasteIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "pdfIcon")
  @js.native
  val pdfIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "pythonIcon")
  @js.native
  val pythonIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "rKernelIcon")
  @js.native
  val rKernelIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "reactIcon")
  @js.native
  val reactIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "redoIcon")
  @js.native
  val redoIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "refreshIcon")
  @js.native
  val refreshIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "regexIcon")
  @js.native
  val regexIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "runIcon")
  @js.native
  val runIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "runningIcon")
  @js.native
  val runningIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "saveIcon")
  @js.native
  val saveIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "searchIcon")
  @js.native
  val searchIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "settingsIcon")
  @js.native
  val settingsIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "spreadsheetIcon")
  @js.native
  val spreadsheetIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "stopIcon")
  @js.native
  val stopIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "tabIcon")
  @js.native
  val tabIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "tableRowsIcon")
  @js.native
  val tableRowsIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "tagIcon")
  @js.native
  val tagIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "terminalIcon")
  @js.native
  val terminalIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "textEditorIcon")
  @js.native
  val textEditorIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "tocIcon")
  @js.native
  val tocIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "treeViewIcon")
  @js.native
  val treeViewIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "trustedIcon")
  @js.native
  val trustedIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "undoIcon")
  @js.native
  val undoIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "vegaIcon")
  @js.native
  val vegaIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "yamlIcon")
  @js.native
  val yamlIcon: typingsJapgolly.jupyterlabUiComponents.libIconLabiconMod.LabIcon = js.native
}
