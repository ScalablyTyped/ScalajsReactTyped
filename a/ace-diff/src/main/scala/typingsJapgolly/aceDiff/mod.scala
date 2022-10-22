package typingsJapgolly.aceDiff

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.aceDiff.aceDiffStrings.broad
import typingsJapgolly.aceDiff.aceDiffStrings.specific
import typingsJapgolly.aceDiff.anon.Connector
import typingsJapgolly.aceDiff.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ace-diff", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AceDiff {
    def this(opts: AceDiffConstructorOpts) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def diff(): Unit = js.native
    
    /* CompleteClass */
    override def getEditors(): Left = js.native
    
    /* CompleteClass */
    override def getNumDiffs(): Double = js.native
    
    /* CompleteClass */
    override def setOptions(options: AceDiffOpts): Unit = js.native
  }
  
  trait AceDiff extends StObject {
    
    def destroy(): Unit
    
    def diff(): Unit
    
    def getEditors(): Left
    
    def getNumDiffs(): Double
    
    def setOptions(options: AceDiffOpts): Unit
  }
  object AceDiff {
    
    inline def apply(
      destroy: Callback,
      diff: Callback,
      getEditors: CallbackTo[Left],
      getNumDiffs: CallbackTo[Double],
      setOptions: AceDiffOpts => Callback
    ): AceDiff = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, diff = diff.toJsFn, getEditors = getEditors.toJsFn, getNumDiffs = getNumDiffs.toJsFn, setOptions = js.Any.fromFunction1((t0: AceDiffOpts) => setOptions(t0).runNow()))
      __obj.asInstanceOf[AceDiff]
    }
    
    extension [Self <: AceDiff](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDiff(value: Callback): Self = StObject.set(x, "diff", value.toJsFn)
      
      inline def setGetEditors(value: CallbackTo[Left]): Self = StObject.set(x, "getEditors", value.toJsFn)
      
      inline def setGetNumDiffs(value: CallbackTo[Double]): Self = StObject.set(x, "getNumDiffs", value.toJsFn)
      
      inline def setSetOptions(value: AceDiffOpts => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: AceDiffOpts) => value(t0).runNow()))
    }
  }
  
  trait AceDiffConstructorOpts
    extends StObject
       with AceDiffOpts {
    
    var element: String | HTMLElement
    
    @JSName("left")
    var left_AceDiffConstructorOpts: AceDiffLROpts
    
    @JSName("right")
    var right_AceDiffConstructorOpts: AceDiffLROpts
  }
  object AceDiffConstructorOpts {
    
    inline def apply(element: String | HTMLElement, left: AceDiffLROpts, right: AceDiffLROpts): AceDiffConstructorOpts = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[AceDiffConstructorOpts]
    }
    
    extension [Self <: AceDiffConstructorOpts](x: Self) {
      
      inline def setElement(value: String | HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: AceDiffLROpts): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: AceDiffLROpts): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait AceDiffLROpts extends StObject {
    
    var content: js.UndefOr[String | Null] = js.undefined
    
    var copyLinkEnabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object AceDiffLROpts {
    
    inline def apply(): AceDiffLROpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AceDiffLROpts]
    }
    
    extension [Self <: AceDiffLROpts](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCopyLinkEnabled(value: Boolean): Self = StObject.set(x, "copyLinkEnabled", value.asInstanceOf[js.Any])
      
      inline def setCopyLinkEnabledUndefined: Self = StObject.set(x, "copyLinkEnabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait AceDiffOpts extends StObject {
    
    var classes: js.UndefOr[Connector] = js.undefined
    
    var diffGranularity: js.UndefOr[specific | broad] = js.undefined
    
    var left: js.UndefOr[AceDiffLROpts] = js.undefined
    
    var maxDiffs: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[AceDiffLROpts] = js.undefined
    
    var showConnectors: js.UndefOr[Boolean] = js.undefined
    
    var showDiffs: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object AceDiffOpts {
    
    inline def apply(): AceDiffOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AceDiffOpts]
    }
    
    extension [Self <: AceDiffOpts](x: Self) {
      
      inline def setClasses(value: Connector): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDiffGranularity(value: specific | broad): Self = StObject.set(x, "diffGranularity", value.asInstanceOf[js.Any])
      
      inline def setDiffGranularityUndefined: Self = StObject.set(x, "diffGranularity", js.undefined)
      
      inline def setLeft(value: AceDiffLROpts): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMaxDiffs(value: Double): Self = StObject.set(x, "maxDiffs", value.asInstanceOf[js.Any])
      
      inline def setMaxDiffsUndefined: Self = StObject.set(x, "maxDiffs", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRight(value: AceDiffLROpts): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setShowConnectors(value: Boolean): Self = StObject.set(x, "showConnectors", value.asInstanceOf[js.Any])
      
      inline def setShowConnectorsUndefined: Self = StObject.set(x, "showConnectors", js.undefined)
      
      inline def setShowDiffs(value: Boolean): Self = StObject.set(x, "showDiffs", value.asInstanceOf[js.Any])
      
      inline def setShowDiffsUndefined: Self = StObject.set(x, "showDiffs", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
