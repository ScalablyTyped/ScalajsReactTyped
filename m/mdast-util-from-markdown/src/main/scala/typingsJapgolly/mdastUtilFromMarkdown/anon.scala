package typingsJapgolly.mdastUtilFromMarkdown

import japgolly.scalajs.react.Callback
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.CompileContext
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.Fragment
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.Handles
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.Node
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.NormalizedExtension
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.OnEnterError
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.OnExitError
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.Token
import typingsJapgolly.mdastUtilFromMarkdown.devLibMod.Transform
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerHexadecimal
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerNumeric
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.collapsed
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.full
import typingsJapgolly.micromarkUtilTypes.anon.PickTokenstartend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CanContainEols extends StObject {
    
    var canContainEols: js.Array[String]
    
    var enter: Handles
    
    var exit: Handles
    
    var transforms: js.Array[Transform]
  }
  object CanContainEols {
    
    inline def apply(canContainEols: js.Array[String], enter: Handles, exit: Handles, transforms: js.Array[Transform]): CanContainEols = {
      val __obj = js.Dynamic.literal(canContainEols = canContainEols.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanContainEols]
    }
    
    extension [Self <: CanContainEols](x: Self) {
      
      inline def setCanContainEols(value: js.Array[String]): Self = StObject.set(x, "canContainEols", value.asInstanceOf[js.Any])
      
      inline def setCanContainEolsVarargs(value: String*): Self = StObject.set(x, "canContainEols", js.Array(value*))
      
      inline def setEnter(value: Handles): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: Handles): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Array[Transform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: Transform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  trait Enter extends StObject {
    
    var canContainEols: js.Array[String]
    
    var enter: typingsJapgolly.mdastUtilFromMarkdown.libMod.Handles
    
    var exit: typingsJapgolly.mdastUtilFromMarkdown.libMod.Handles
    
    var transforms: js.Array[typingsJapgolly.mdastUtilFromMarkdown.libMod.Transform]
  }
  object Enter {
    
    inline def apply(
      canContainEols: js.Array[String],
      enter: typingsJapgolly.mdastUtilFromMarkdown.libMod.Handles,
      exit: typingsJapgolly.mdastUtilFromMarkdown.libMod.Handles,
      transforms: js.Array[typingsJapgolly.mdastUtilFromMarkdown.libMod.Transform]
    ): Enter = {
      val __obj = js.Dynamic.literal(canContainEols = canContainEols.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enter]
    }
    
    extension [Self <: Enter](x: Self) {
      
      inline def setCanContainEols(value: js.Array[String]): Self = StObject.set(x, "canContainEols", value.asInstanceOf[js.Any])
      
      inline def setCanContainEolsVarargs(value: String*): Self = StObject.set(x, "canContainEols", js.Array(value*))
      
      inline def setEnter(value: typingsJapgolly.mdastUtilFromMarkdown.libMod.Handles): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: typingsJapgolly.mdastUtilFromMarkdown.libMod.Handles): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Array[typingsJapgolly.mdastUtilFromMarkdown.libMod.Transform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: typingsJapgolly.mdastUtilFromMarkdown.libMod.Transform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(token: PickTokenstartend): String = js.native
    def apply(token: PickTokenstartend, expandTabs: Boolean): String = js.native
  }
  
  /* Inlined std.Omit<mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.CompileContext, 'sliceSerialize'> */
  trait OmitCompileContextsliceSe extends StObject {
    
    def buffer(): Unit
    @JSName("buffer")
    var buffer_Original: js.ThisFunction0[/* this */ CompileContext, Unit]
    
    var config: NormalizedExtension
    
    def enter[N /* <: Node */](node: N, token: Token): N
    def enter[N /* <: Node */](node: N, token: Token, onError: OnEnterError): N
    @JSName("enter")
    var enter_Original: js.ThisFunction3[
        /* this */ CompileContext, 
        /* node */ Node, 
        /* token */ Token, 
        /* onError */ js.UndefOr[OnEnterError], 
        Node
      ]
    
    def exit(token: Token): Node
    def exit(token: Token, onError: OnExitError): Node
    @JSName("exit")
    var exit_Original: js.ThisFunction2[
        /* this */ CompileContext, 
        /* token */ Token, 
        /* onError */ js.UndefOr[OnExitError], 
        Node
      ]
    
    def getData[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.CompileData[K] */ js.Any
    @JSName("getData")
    var getData_Original: js.Function1[
        /* key */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.CompileData[string] */ js.Any
      ]
    
    def resume(): String
    @JSName("resume")
    var resume_Original: js.ThisFunction0[/* this */ CompileContext, String]
    
    def setData(key: String): Unit
    def setData(key: String, value: Any): Unit
    @JSName("setData")
    var setData_Original: js.Function2[/* key */ String, /* value */ js.UndefOr[Any], Unit]
    
    var stack: js.Array[Node | Fragment]
    
    var tokenStack: js.Array[js.Tuple2[Token, js.UndefOr[OnEnterError]]]
  }
  object OmitCompileContextsliceSe {
    
    inline def apply(
      buffer: js.ThisFunction0[/* this */ CompileContext, Unit],
      config: NormalizedExtension,
      enter: js.ThisFunction3[
          /* this */ CompileContext, 
          /* node */ Node, 
          /* token */ Token, 
          /* onError */ js.UndefOr[OnEnterError], 
          Node
        ],
      exit: js.ThisFunction2[
          /* this */ CompileContext, 
          /* token */ Token, 
          /* onError */ js.UndefOr[OnExitError], 
          Node
        ],
      getData: /* key */ String => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.CompileData[string] */ js.Any,
      resume: js.ThisFunction0[/* this */ CompileContext, String],
      setData: (/* key */ String, /* value */ js.UndefOr[Any]) => Callback,
      stack: js.Array[Node | Fragment],
      tokenStack: js.Array[js.Tuple2[Token, js.UndefOr[OnEnterError]]]
    ): OmitCompileContextsliceSe = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), resume = resume.asInstanceOf[js.Any], setData = js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ js.UndefOr[Any]) => (setData(t0, t1)).runNow()), stack = stack.asInstanceOf[js.Any], tokenStack = tokenStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitCompileContextsliceSe]
    }
    
    extension [Self <: OmitCompileContextsliceSe](x: Self) {
      
      inline def setBuffer(value: js.ThisFunction0[/* this */ CompileContext, Unit]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: NormalizedExtension): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEnter(
        value: js.ThisFunction3[
              /* this */ CompileContext, 
              /* node */ Node, 
              /* token */ Token, 
              /* onError */ js.UndefOr[OnEnterError], 
              Node
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(
        value: js.ThisFunction2[
              /* this */ CompileContext, 
              /* token */ Token, 
              /* onError */ js.UndefOr[OnExitError], 
              Node
            ]
      ): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setGetData(
        value: /* key */ String => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.CompileData[string] */ js.Any
      ): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setResume(value: js.ThisFunction0[/* this */ CompileContext, String]): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setSetData(value: (/* key */ String, /* value */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setStack(value: js.Array[Node | Fragment]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: (Node | Fragment)*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setTokenStack(value: js.Array[js.Tuple2[Token, js.UndefOr[OnEnterError]]]): Self = StObject.set(x, "tokenStack", value.asInstanceOf[js.Any])
      
      inline def setTokenStackVarargs(value: (js.Tuple2[Token, js.UndefOr[OnEnterError]])*): Self = StObject.set(x, "tokenStack", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<mdast-util-from-markdown.mdast-util-from-markdown/lib.CompileContext, 'sliceSerialize'> */
  trait OmitCompileContextsliceSeBuffer extends StObject {
    
    def buffer(): Unit
    @JSName("buffer")
    var buffer_Original: js.ThisFunction0[/* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, Unit]
    
    var config: typingsJapgolly.mdastUtilFromMarkdown.libMod.NormalizedExtension
    
    def enter[N /* <: typingsJapgolly.mdastUtilFromMarkdown.libMod.Node */](node: N, token: typingsJapgolly.mdastUtilFromMarkdown.libMod.Token): N
    def enter[N /* <: typingsJapgolly.mdastUtilFromMarkdown.libMod.Node */](
      node: N,
      token: typingsJapgolly.mdastUtilFromMarkdown.libMod.Token,
      onError: typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError
    ): N
    @JSName("enter")
    var enter_Original: js.ThisFunction3[
        /* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, 
        /* node */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Node, 
        /* token */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
        /* onError */ js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError], 
        typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
      ]
    
    def exit(token: typingsJapgolly.mdastUtilFromMarkdown.libMod.Token): typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
    def exit(
      token: typingsJapgolly.mdastUtilFromMarkdown.libMod.Token,
      onError: typingsJapgolly.mdastUtilFromMarkdown.libMod.OnExitError
    ): typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
    @JSName("exit")
    var exit_Original: js.ThisFunction2[
        /* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, 
        /* token */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
        /* onError */ js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnExitError], 
        typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
      ]
    
    def getData[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/lib.CompileData[K] */ js.Any
    @JSName("getData")
    var getData_Original: js.Function1[
        /* key */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/lib.CompileData[string] */ js.Any
      ]
    
    def resume(): String
    @JSName("resume")
    var resume_Original: js.ThisFunction0[/* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, String]
    
    def setData(key: String): Unit
    def setData(key: String, value: Any): Unit
    @JSName("setData")
    var setData_Original: js.Function2[/* key */ String, /* value */ js.UndefOr[Any], Unit]
    
    var stack: js.Array[
        typingsJapgolly.mdastUtilFromMarkdown.libMod.Node | typingsJapgolly.mdastUtilFromMarkdown.libMod.Fragment
      ]
    
    var tokenStack: js.Array[
        js.Tuple2[
          typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
          js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError]
        ]
      ]
  }
  object OmitCompileContextsliceSeBuffer {
    
    inline def apply(
      buffer: js.ThisFunction0[/* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, Unit],
      config: typingsJapgolly.mdastUtilFromMarkdown.libMod.NormalizedExtension,
      enter: js.ThisFunction3[
          /* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, 
          /* node */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Node, 
          /* token */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
          /* onError */ js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError], 
          typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
        ],
      exit: js.ThisFunction2[
          /* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, 
          /* token */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
          /* onError */ js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnExitError], 
          typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
        ],
      getData: /* key */ String => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/lib.CompileData[string] */ js.Any,
      resume: js.ThisFunction0[/* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, String],
      setData: (/* key */ String, /* value */ js.UndefOr[Any]) => Callback,
      stack: js.Array[
          typingsJapgolly.mdastUtilFromMarkdown.libMod.Node | typingsJapgolly.mdastUtilFromMarkdown.libMod.Fragment
        ],
      tokenStack: js.Array[
          js.Tuple2[
            typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
            js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError]
          ]
        ]
    ): OmitCompileContextsliceSeBuffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), resume = resume.asInstanceOf[js.Any], setData = js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ js.UndefOr[Any]) => (setData(t0, t1)).runNow()), stack = stack.asInstanceOf[js.Any], tokenStack = tokenStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitCompileContextsliceSeBuffer]
    }
    
    extension [Self <: OmitCompileContextsliceSeBuffer](x: Self) {
      
      inline def setBuffer(
        value: js.ThisFunction0[/* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, Unit]
      ): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: typingsJapgolly.mdastUtilFromMarkdown.libMod.NormalizedExtension): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEnter(
        value: js.ThisFunction3[
              /* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, 
              /* node */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Node, 
              /* token */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
              /* onError */ js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError], 
              typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(
        value: js.ThisFunction2[
              /* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, 
              /* token */ typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
              /* onError */ js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnExitError], 
              typingsJapgolly.mdastUtilFromMarkdown.libMod.Node
            ]
      ): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setGetData(
        value: /* key */ String => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/lib.CompileData[string] */ js.Any
      ): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setResume(
        value: js.ThisFunction0[/* this */ typingsJapgolly.mdastUtilFromMarkdown.libMod.CompileContext, String]
      ): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setSetData(value: (/* key */ String, /* value */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setStack(
        value: js.Array[
              typingsJapgolly.mdastUtilFromMarkdown.libMod.Node | typingsJapgolly.mdastUtilFromMarkdown.libMod.Fragment
            ]
      ): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(
        value: (typingsJapgolly.mdastUtilFromMarkdown.libMod.Node | typingsJapgolly.mdastUtilFromMarkdown.libMod.Fragment)*
      ): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setTokenStack(
        value: js.Array[
              js.Tuple2[
                typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
                js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError]
              ]
            ]
      ): Self = StObject.set(x, "tokenStack", value.asInstanceOf[js.Any])
      
      inline def setTokenStackVarargs(
        value: (js.Tuple2[
              typingsJapgolly.mdastUtilFromMarkdown.libMod.Token, 
              js.UndefOr[typingsJapgolly.mdastUtilFromMarkdown.libMod.OnEnterError]
            ])*
      ): Self = StObject.set(x, "tokenStack", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<mdast-util-from-markdown.mdast-util-from-markdown/lib._CompileDataFields> */
  trait PartialCompileDataFields extends StObject {
    
    var atHardBreak: js.UndefOr[Boolean] = js.undefined
    
    var characterReferenceType: js.UndefOr[characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric] = js.undefined
    
    var expectingFirstListItemValue: js.UndefOr[Boolean] = js.undefined
    
    var flowCodeInside: js.UndefOr[Boolean] = js.undefined
    
    var inReference: js.UndefOr[Boolean] = js.undefined
    
    var referenceType: js.UndefOr[collapsed | full] = js.undefined
    
    var setextHeadingSlurpLineEnding: js.UndefOr[Boolean] = js.undefined
  }
  object PartialCompileDataFields {
    
    inline def apply(): PartialCompileDataFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCompileDataFields]
    }
    
    extension [Self <: PartialCompileDataFields](x: Self) {
      
      inline def setAtHardBreak(value: Boolean): Self = StObject.set(x, "atHardBreak", value.asInstanceOf[js.Any])
      
      inline def setAtHardBreakUndefined: Self = StObject.set(x, "atHardBreak", js.undefined)
      
      inline def setCharacterReferenceType(value: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric): Self = StObject.set(x, "characterReferenceType", value.asInstanceOf[js.Any])
      
      inline def setCharacterReferenceTypeUndefined: Self = StObject.set(x, "characterReferenceType", js.undefined)
      
      inline def setExpectingFirstListItemValue(value: Boolean): Self = StObject.set(x, "expectingFirstListItemValue", value.asInstanceOf[js.Any])
      
      inline def setExpectingFirstListItemValueUndefined: Self = StObject.set(x, "expectingFirstListItemValue", js.undefined)
      
      inline def setFlowCodeInside(value: Boolean): Self = StObject.set(x, "flowCodeInside", value.asInstanceOf[js.Any])
      
      inline def setFlowCodeInsideUndefined: Self = StObject.set(x, "flowCodeInside", js.undefined)
      
      inline def setInReference(value: Boolean): Self = StObject.set(x, "inReference", value.asInstanceOf[js.Any])
      
      inline def setInReferenceUndefined: Self = StObject.set(x, "inReference", js.undefined)
      
      inline def setReferenceType(value: collapsed | full): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
      
      inline def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
      
      inline def setSetextHeadingSlurpLineEnding(value: Boolean): Self = StObject.set(x, "setextHeadingSlurpLineEnding", value.asInstanceOf[js.Any])
      
      inline def setSetextHeadingSlurpLineEndingUndefined: Self = StObject.set(x, "setextHeadingSlurpLineEnding", js.undefined)
    }
  }
}
