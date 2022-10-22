package typingsJapgolly.activexVbide

import typingsJapgolly.activexOffice.Office.CommandBar
import typingsJapgolly.activexOffice.Office.CommandBars
import typingsJapgolly.activexVbide.VBIDE.Addins
import typingsJapgolly.activexVbide.VBIDE.CodePanes
import typingsJapgolly.activexVbide.VBIDE.Components
import typingsJapgolly.activexVbide.VBIDE.LinkedWindows
import typingsJapgolly.activexVbide.VBIDE.Properties
import typingsJapgolly.activexVbide.VBIDE.References
import typingsJapgolly.activexVbide.VBIDE.VBComponents
import typingsJapgolly.activexVbide.VBIDE.VBProjects
import typingsJapgolly.activexVbide.VBIDE.Windows
import typingsJapgolly.activexVbide.VBIDE.vbextCodePaneview
import typingsJapgolly.activexVbide.VBIDE.vbextComponentType
import typingsJapgolly.activexVbide.VBIDE.vbextProjectProtection
import typingsJapgolly.activexVbide.VBIDE.vbextProjectType
import typingsJapgolly.activexVbide.VBIDE.vbextRefKind
import typingsJapgolly.activexVbide.VBIDE.vbextVBAMode
import typingsJapgolly.activexVbide.VBIDE.vbextWindowState
import typingsJapgolly.activexVbide.VBIDE.vbextWindowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object VBIDE {
    
    @JSGlobal("VBIDE.AddIn")
    @js.native
    /* private */ open class AddIn ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.AddIn {
      
      /* CompleteClass */
      override def Collection(index: Any): typingsJapgolly.activexVbide.VBIDE.AddIn = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: Addins = js.native
      
      /* CompleteClass */
      var Connect: Boolean = js.native
      
      /* CompleteClass */
      var Description: String = js.native
      
      /* CompleteClass */
      override val Guid: String = js.native
      
      /* CompleteClass */
      var Object: Any = js.native
      
      /* CompleteClass */
      override val ProgId: String = js.native
      
      /* CompleteClass */
      override val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.AddIn_typekey")
      var VBIDEDotAddIn_typekey: typingsJapgolly.activexVbide.VBIDE.AddIn = js.native
    }
    
    @JSGlobal("VBIDE.Application")
    @js.native
    /* private */ open class Application ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.Application {
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Application_typekey")
      var VBIDEDotApplication_typekey: typingsJapgolly.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      override val Version: String = js.native
    }
    
    @JSGlobal("VBIDE.CodeModule")
    @js.native
    /* private */ open class CodeModule ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.CodeModule
    
    @JSGlobal("VBIDE.CodePane")
    @js.native
    /* private */ open class CodePane ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.CodePane {
      
      /* CompleteClass */
      override val CodeModule: typingsJapgolly.activexVbide.VBIDE.CodeModule = js.native
      
      /* CompleteClass */
      override val CodePaneView: vbextCodePaneview = js.native
      
      /* CompleteClass */
      override def Collection(index: Any): typingsJapgolly.activexVbide.VBIDE.CodePane = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: CodePanes = js.native
      
      /* CompleteClass */
      override val CountOfVisibleLines: Double = js.native
      
      /* CompleteClass */
      override def GetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
      
      /* CompleteClass */
      override def SetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
      
      /* CompleteClass */
      override def Show(): Unit = js.native
      
      /* CompleteClass */
      var TopLine: Double = js.native
      
      /* CompleteClass */
      override val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.CodePane_typekey")
      var VBIDEDotCodePane_typekey: typingsJapgolly.activexVbide.VBIDE.CodePane = js.native
      
      /* CompleteClass */
      override val Window: typingsJapgolly.activexVbide.VBIDE.Window = js.native
    }
    
    @JSGlobal("VBIDE.CommandBarEvents")
    @js.native
    /* private */ open class CommandBarEvents ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.CommandBarEvents {
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.CommandBarEvents_typekey")
      var VBIDEDotCommandBarEvents_typekey: typingsJapgolly.activexVbide.VBIDE.CommandBarEvents = js.native
    }
    
    @JSGlobal("VBIDE.Component")
    @js.native
    /* private */ open class Component ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.Component {
      
      /* CompleteClass */
      override val Application: typingsJapgolly.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      var IsDirty: Boolean = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override def Parent(index: Any): typingsJapgolly.activexVbide.VBIDE.Component = js.native
      /* CompleteClass */
      @JSName("Parent")
      override val Parent_Original: Components = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Component_typekey")
      var VBIDEDotComponent_typekey: typingsJapgolly.activexVbide.VBIDE.Component = js.native
    }
    
    @JSGlobal("VBIDE.Events")
    @js.native
    /* private */ open class Events ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.Events {
      
      /* CompleteClass */
      override def CommandBarEvents(CommandBarControl: Any): typingsJapgolly.activexVbide.VBIDE.CommandBarEvents = js.native
      
      /* CompleteClass */
      override def ReferencesEvents(VBProject: typingsJapgolly.activexVbide.VBIDE.VBProject): typingsJapgolly.activexVbide.VBIDE.ReferencesEvents = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Events_typekey")
      var VBIDEDotEvents_typekey: typingsJapgolly.activexVbide.VBIDE.Events = js.native
    }
    
    @JSGlobal("VBIDE.ProjectTemplate")
    @js.native
    /* private */ open class ProjectTemplate ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.ProjectTemplate {
      
      /* CompleteClass */
      override val Application: typingsJapgolly.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      override val Parent: typingsJapgolly.activexVbide.VBIDE.Application = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.ProjectTemplate_typekey")
      var VBIDEDotProjectTemplate_typekey: typingsJapgolly.activexVbide.VBIDE.ProjectTemplate = js.native
    }
    
    @JSGlobal("VBIDE.Property")
    @js.native
    /* private */ open class Property ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.Property
    
    @JSGlobal("VBIDE.Reference")
    @js.native
    /* private */ open class Reference ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.Reference {
      
      /* CompleteClass */
      override val BuiltIn: Boolean = js.native
      
      /* CompleteClass */
      override def Collection(index: Any): typingsJapgolly.activexVbide.VBIDE.Reference = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: References = js.native
      
      /* CompleteClass */
      override val Description: String = js.native
      
      /* CompleteClass */
      override val FullPath: String = js.native
      
      /* CompleteClass */
      override val Guid: String = js.native
      
      /* CompleteClass */
      override val IsBroken: Boolean = js.native
      
      /* CompleteClass */
      override val Major: Double = js.native
      
      /* CompleteClass */
      override val Minor: Double = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      override val Type: vbextRefKind = js.native
      
      /* CompleteClass */
      override val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Reference_typekey")
      var VBIDEDotReference_typekey: typingsJapgolly.activexVbide.VBIDE.Reference = js.native
    }
    
    @JSGlobal("VBIDE.ReferencesEvents")
    @js.native
    /* private */ open class ReferencesEvents ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.ReferencesEvents {
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.ReferencesEvents_typekey")
      var VBIDEDotReferencesEvents_typekey: typingsJapgolly.activexVbide.VBIDE.ReferencesEvents = js.native
    }
    
    @JSGlobal("VBIDE.VBComponent")
    @js.native
    /* private */ open class VBComponent ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.VBComponent {
      
      /* CompleteClass */
      override def Activate(): Unit = js.native
      
      /* CompleteClass */
      override val CodeModule: typingsJapgolly.activexVbide.VBIDE.CodeModule = js.native
      
      /* CompleteClass */
      override def Collection(index: Any): typingsJapgolly.activexVbide.VBIDE.VBComponent = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: VBComponents = js.native
      
      /* CompleteClass */
      override val Designer: Any = js.native
      
      /* CompleteClass */
      override val DesignerID: String = js.native
      
      /* CompleteClass */
      override def DesignerWindow(): typingsJapgolly.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override def Export(FileName: String): Unit = js.native
      
      /* CompleteClass */
      override val HasOpenDesigner: Boolean = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override def Properties(index: Any): typingsJapgolly.activexVbide.VBIDE.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      override val Saved: Boolean = js.native
      
      /* CompleteClass */
      override val Type: vbextComponentType = js.native
      
      /* CompleteClass */
      override val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.VBComponent_typekey")
      var VBIDEDotVBComponent_typekey: typingsJapgolly.activexVbide.VBIDE.VBComponent = js.native
    }
    
    @JSGlobal("VBIDE.VBE")
    @js.native
    /* private */ open class VBE ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.VBE {
      
      /* CompleteClass */
      var ActiveCodePane: typingsJapgolly.activexVbide.VBIDE.CodePane = js.native
      
      /* CompleteClass */
      var ActiveVBProject: typingsJapgolly.activexVbide.VBIDE.VBProject = js.native
      
      /* CompleteClass */
      override val ActiveWindow: typingsJapgolly.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override def Addins(index: Any): typingsJapgolly.activexVbide.VBIDE.AddIn = js.native
      /* CompleteClass */
      @JSName("Addins")
      override val Addins_Original: Addins = js.native
      
      /* CompleteClass */
      override def CodePanes(index: Any): typingsJapgolly.activexVbide.VBIDE.CodePane = js.native
      /* CompleteClass */
      @JSName("CodePanes")
      override val CodePanes_Original: CodePanes = js.native
      
      /* CompleteClass */
      override def CommandBars(Index: String): CommandBar = js.native
      /* CompleteClass */
      override def CommandBars(Index: Double): CommandBar = js.native
      /* CompleteClass */
      @JSName("CommandBars")
      override val CommandBars_Original: CommandBars = js.native
      
      /* CompleteClass */
      override val Events: typingsJapgolly.activexVbide.VBIDE.Events = js.native
      
      /* CompleteClass */
      override val MainWindow: typingsJapgolly.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override val SelectedVBComponent: typingsJapgolly.activexVbide.VBIDE.VBComponent = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.VBE_typekey")
      var VBIDEDotVBE_typekey: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
      
      /* CompleteClass */
      override def VBProjects(index: Any): typingsJapgolly.activexVbide.VBIDE.VBProject = js.native
      /* CompleteClass */
      @JSName("VBProjects")
      override val VBProjects_Original: VBProjects = js.native
      
      /* CompleteClass */
      override val Version: String = js.native
      
      /* CompleteClass */
      override def Windows(index: Any): typingsJapgolly.activexVbide.VBIDE.Window = js.native
      /* CompleteClass */
      @JSName("Windows")
      override val Windows_Original: Windows = js.native
    }
    
    @JSGlobal("VBIDE.VBProject")
    @js.native
    /* private */ open class VBProject ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.VBProject {
      
      /* CompleteClass */
      override val Application: typingsJapgolly.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      var BuildFileName: String = js.native
      
      /* CompleteClass */
      override def Collection(index: Any): typingsJapgolly.activexVbide.VBIDE.VBProject = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: VBProjects = js.native
      
      /* CompleteClass */
      var Description: String = js.native
      
      /* CompleteClass */
      override val FileName: String = js.native
      
      /* CompleteClass */
      var HelpContextID: Double = js.native
      
      /* CompleteClass */
      var HelpFile: String = js.native
      
      /* CompleteClass */
      override def MakeCompiledFile(): Unit = js.native
      
      /* CompleteClass */
      override val Mode: vbextVBAMode = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override val Parent: typingsJapgolly.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      override val Protection: vbextProjectProtection = js.native
      
      /* CompleteClass */
      override def References(index: Any): typingsJapgolly.activexVbide.VBIDE.Reference = js.native
      /* CompleteClass */
      @JSName("References")
      override val References_Original: References = js.native
      
      /* CompleteClass */
      override def SaveAs(FileName: String): Unit = js.native
      
      /* CompleteClass */
      override val Saved: Boolean = js.native
      
      /* CompleteClass */
      override val Type: vbextProjectType = js.native
      
      /* CompleteClass */
      override def VBComponents(index: Any): typingsJapgolly.activexVbide.VBIDE.VBComponent = js.native
      /* CompleteClass */
      @JSName("VBComponents")
      override val VBComponents_Original: VBComponents = js.native
      
      /* CompleteClass */
      override val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.VBProject_typekey")
      var VBIDEDotVBProject_typekey: typingsJapgolly.activexVbide.VBIDE.VBProject = js.native
    }
    
    @JSGlobal("VBIDE.Window")
    @js.native
    /* private */ open class Window ()
      extends StObject
         with typingsJapgolly.activexVbide.VBIDE.Window {
      
      /* CompleteClass */
      override val Caption: String = js.native
      
      /* CompleteClass */
      override def Close(): Unit = js.native
      
      /* CompleteClass */
      override def Collection(index: Any): typingsJapgolly.activexVbide.VBIDE.Window = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: Windows = js.native
      
      /* CompleteClass */
      override val HWnd: Double = js.native
      
      /* CompleteClass */
      var Height: Double = js.native
      
      /* CompleteClass */
      var Left: Double = js.native
      
      /* CompleteClass */
      override val LinkedWindowFrame: typingsJapgolly.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override def LinkedWindows(index: Any): typingsJapgolly.activexVbide.VBIDE.Window = js.native
      /* CompleteClass */
      @JSName("LinkedWindows")
      override val LinkedWindows_Original: LinkedWindows = js.native
      
      /* CompleteClass */
      override def SetFocus(): Unit = js.native
      
      /* CompleteClass */
      var Top: Double = js.native
      
      /* CompleteClass */
      override val Type: vbextWindowType = js.native
      
      /* CompleteClass */
      override val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Window_typekey")
      var VBIDEDotWindow_typekey: typingsJapgolly.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      var Visible: Boolean = js.native
      
      /* CompleteClass */
      var Width: Double = js.native
      
      /* CompleteClass */
      var WindowState: vbextWindowState = js.native
    }
  }
}
