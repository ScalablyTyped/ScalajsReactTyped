package typingsJapgolly.hastscript

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hast.mod.Comment
import typingsJapgolly.hast.mod.DocType
import typingsJapgolly.hast.mod.Text
import typingsJapgolly.hastscript.anon.FnCall
import typingsJapgolly.hastscript.anon.Fragment
import typingsJapgolly.hastscript.libCoreMod.HArrayChild
import typingsJapgolly.hastscript.libCoreMod.HArrayValue
import typingsJapgolly.hastscript.libCoreMod.HStyleValue
import typingsJapgolly.hastscript.libCoreMod.Schema
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeMod {
  
  @JSImport("hastscript/lib/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runtime(f: ReturnType[Core]): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("runtime")(f.asInstanceOf[js.Any]).asInstanceOf[Fragment]
  
  type Core = js.Function3[
    /* schema */ Schema, 
    /* defaultTagName */ String, 
    /* caseSensitive */ js.UndefOr[js.Array[String]], 
    FnCall
  ]
  
  type Element = typingsJapgolly.hastscript.libCoreMod.Element
  
  type HChild = typingsJapgolly.hastscript.libCoreMod.HChild
  
  type HProperties = typingsJapgolly.hastscript.libCoreMod.HProperties
  
  type HPropertyValue = typingsJapgolly.hastscript.libCoreMod.HPropertyValue
  
  type HResult = typingsJapgolly.hastscript.libCoreMod.HResult
  
  type HStyle = typingsJapgolly.hastscript.libCoreMod.HStyle
  
  type JSXProps = StringDictionary[
    js.UndefOr[
      String | Double | Boolean | typingsJapgolly.hast.mod.Root | typingsJapgolly.hast.mod.Element | DocType | Comment | Text | StringDictionary[HStyleValue] | HArrayValue | HArrayChild | Null
    ]
  ]
  
  type Root = typingsJapgolly.hastscript.libCoreMod.Root
}
