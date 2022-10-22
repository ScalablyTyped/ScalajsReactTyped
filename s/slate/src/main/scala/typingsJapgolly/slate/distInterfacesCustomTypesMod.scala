package typingsJapgolly.slate

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesCustomTypesMod {
  
  type CustomTypes = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.slate.slateStrings.Editor
    - typingsJapgolly.slate.slateStrings.Element
    - typingsJapgolly.slate.slateStrings.Text
    - typingsJapgolly.slate.slateStrings.Selection
    - typingsJapgolly.slate.slateStrings.Range
    - typingsJapgolly.slate.slateStrings.Point
    - typingsJapgolly.slate.slateStrings.Operation
    - typingsJapgolly.slate.slateStrings.InsertNodeOperation
    - typingsJapgolly.slate.slateStrings.InsertTextOperation
    - typingsJapgolly.slate.slateStrings.MergeNodeOperation
    - typingsJapgolly.slate.slateStrings.MoveNodeOperation
    - typingsJapgolly.slate.slateStrings.RemoveNodeOperation
    - typingsJapgolly.slate.slateStrings.RemoveTextOperation
    - typingsJapgolly.slate.slateStrings.SetNodeOperation
    - typingsJapgolly.slate.slateStrings.SetSelectionOperation
    - typingsJapgolly.slate.slateStrings.SplitNodeOperation
  */
  trait ExtendableTypes extends StObject
  object ExtendableTypes {
    
    inline def Editor: typingsJapgolly.slate.slateStrings.Editor = "Editor".asInstanceOf[typingsJapgolly.slate.slateStrings.Editor]
    
    inline def Element: typingsJapgolly.slate.slateStrings.Element = "Element".asInstanceOf[typingsJapgolly.slate.slateStrings.Element]
    
    inline def InsertNodeOperation: typingsJapgolly.slate.slateStrings.InsertNodeOperation = "InsertNodeOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.InsertNodeOperation]
    
    inline def InsertTextOperation: typingsJapgolly.slate.slateStrings.InsertTextOperation = "InsertTextOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.InsertTextOperation]
    
    inline def MergeNodeOperation: typingsJapgolly.slate.slateStrings.MergeNodeOperation = "MergeNodeOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.MergeNodeOperation]
    
    inline def MoveNodeOperation: typingsJapgolly.slate.slateStrings.MoveNodeOperation = "MoveNodeOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.MoveNodeOperation]
    
    inline def Operation: typingsJapgolly.slate.slateStrings.Operation = "Operation".asInstanceOf[typingsJapgolly.slate.slateStrings.Operation]
    
    inline def Point: typingsJapgolly.slate.slateStrings.Point = "Point".asInstanceOf[typingsJapgolly.slate.slateStrings.Point]
    
    inline def Range: typingsJapgolly.slate.slateStrings.Range = "Range".asInstanceOf[typingsJapgolly.slate.slateStrings.Range]
    
    inline def RemoveNodeOperation: typingsJapgolly.slate.slateStrings.RemoveNodeOperation = "RemoveNodeOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.RemoveNodeOperation]
    
    inline def RemoveTextOperation: typingsJapgolly.slate.slateStrings.RemoveTextOperation = "RemoveTextOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.RemoveTextOperation]
    
    inline def Selection: typingsJapgolly.slate.slateStrings.Selection = "Selection".asInstanceOf[typingsJapgolly.slate.slateStrings.Selection]
    
    inline def SetNodeOperation: typingsJapgolly.slate.slateStrings.SetNodeOperation = "SetNodeOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.SetNodeOperation]
    
    inline def SetSelectionOperation: typingsJapgolly.slate.slateStrings.SetSelectionOperation = "SetSelectionOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.SetSelectionOperation]
    
    inline def SplitNodeOperation: typingsJapgolly.slate.slateStrings.SplitNodeOperation = "SplitNodeOperation".asInstanceOf[typingsJapgolly.slate.slateStrings.SplitNodeOperation]
    
    inline def Text: typingsJapgolly.slate.slateStrings.Text = "Text".asInstanceOf[typingsJapgolly.slate.slateStrings.Text]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    unknown extends slate.slate/dist/interfaces/custom-types.CustomTypes[K] ? B : slate.slate/dist/interfaces/custom-types.CustomTypes[K]
    }}}
    */
  @js.native
  trait ExtendedType[K /* <: ExtendableTypes */, B] extends StObject
}
