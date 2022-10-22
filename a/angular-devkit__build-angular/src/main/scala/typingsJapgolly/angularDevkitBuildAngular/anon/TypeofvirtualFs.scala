package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angularDevkitCore.mod.virtualFs.AliasHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.CordHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.Empty
import typingsJapgolly.angularDevkitCore.mod.virtualFs.PatternMatchingHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.ResolverHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.SafeReadonlyHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.ScopedHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.SimpleMemoryHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.SyncDelegateHost
import typingsJapgolly.angularDevkitCore.mod.virtualFs.SynchronousDelegateExpectedException
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostCreateMod.SyncHostHandler
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.FileBuffer
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.ReadonlyHost
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofvirtualFs extends StObject {
  
  var AliasHost: Instantiable1[
    /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
    typingsJapgolly.angularDevkitCore.mod.virtualFs.AliasHost[js.Object]
  ]
  
  var CordHost: Instantiable1[
    /* _back */ ReadonlyHost[js.Object], 
    typingsJapgolly.angularDevkitCore.mod.virtualFs.CordHost
  ]
  
  var Empty: Instantiable0[typingsJapgolly.angularDevkitCore.mod.virtualFs.Empty]
  
  var PatternMatchingHost: Instantiable1[
    /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
    typingsJapgolly.angularDevkitCore.mod.virtualFs.PatternMatchingHost[js.Object]
  ]
  
  var ResolverHost: Instantiable1[
    /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
    typingsJapgolly.angularDevkitCore.mod.virtualFs.ResolverHost[js.Object]
  ]
  
  var SafeReadonlyHost: Instantiable1[
    /* _delegate */ ReadonlyHost[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
    typingsJapgolly.angularDevkitCore.mod.virtualFs.SafeReadonlyHost[js.Object]
  ]
  
  var ScopedHost: Instantiable1[
    /* delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
    typingsJapgolly.angularDevkitCore.mod.virtualFs.ScopedHost[js.Object]
  ]
  
  var SimpleMemoryHost: Instantiable0[typingsJapgolly.angularDevkitCore.mod.virtualFs.SimpleMemoryHost]
  
  var SyncDelegateHost: Instantiable1[
    /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
    typingsJapgolly.angularDevkitCore.mod.virtualFs.SyncDelegateHost[js.Object]
  ]
  
  var SynchronousDelegateExpectedException: Instantiable0[
    typingsJapgolly.angularDevkitCore.mod.virtualFs.SynchronousDelegateExpectedException
  ]
  
  def createSyncHost[StatsT /* <: js.Object */](handler: SyncHostHandler[StatsT]): Host[StatsT]
  
  def fileBuffer(template: TemplateStringsArray, substitutions: Any*): FileBuffer
  
  def fileBufferToString(fileBuffer: FileBuffer): String
  
  def stringToFileBuffer(str: String): FileBuffer
  
  val test: Typeoftest
}
object TypeofvirtualFs {
  
  inline def apply(
    AliasHost: Instantiable1[
      /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
      AliasHost[js.Object]
    ],
    CordHost: Instantiable1[/* _back */ ReadonlyHost[js.Object], CordHost],
    Empty: Instantiable0[Empty],
    PatternMatchingHost: Instantiable1[
      /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
      PatternMatchingHost[js.Object]
    ],
    ResolverHost: Instantiable1[
      /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
      ResolverHost[js.Object]
    ],
    SafeReadonlyHost: Instantiable1[
      /* _delegate */ ReadonlyHost[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
      SafeReadonlyHost[js.Object]
    ],
    ScopedHost: Instantiable1[
      /* delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
      ScopedHost[js.Object]
    ],
    SimpleMemoryHost: Instantiable0[SimpleMemoryHost],
    SyncDelegateHost: Instantiable1[
      /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
      SyncDelegateHost[js.Object]
    ],
    SynchronousDelegateExpectedException: Instantiable0[SynchronousDelegateExpectedException],
    createSyncHost: SyncHostHandler[Any] => Host[Any],
    fileBuffer: (TemplateStringsArray, /* repeated */ Any) => FileBuffer,
    fileBufferToString: FileBuffer => String,
    stringToFileBuffer: String => FileBuffer,
    test: Typeoftest
  ): TypeofvirtualFs = {
    val __obj = js.Dynamic.literal(AliasHost = AliasHost.asInstanceOf[js.Any], CordHost = CordHost.asInstanceOf[js.Any], Empty = Empty.asInstanceOf[js.Any], PatternMatchingHost = PatternMatchingHost.asInstanceOf[js.Any], ResolverHost = ResolverHost.asInstanceOf[js.Any], SafeReadonlyHost = SafeReadonlyHost.asInstanceOf[js.Any], ScopedHost = ScopedHost.asInstanceOf[js.Any], SimpleMemoryHost = SimpleMemoryHost.asInstanceOf[js.Any], SyncDelegateHost = SyncDelegateHost.asInstanceOf[js.Any], SynchronousDelegateExpectedException = SynchronousDelegateExpectedException.asInstanceOf[js.Any], createSyncHost = js.Any.fromFunction1(createSyncHost), fileBuffer = js.Any.fromFunction2(fileBuffer), fileBufferToString = js.Any.fromFunction1(fileBufferToString), stringToFileBuffer = js.Any.fromFunction1(stringToFileBuffer), test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofvirtualFs]
  }
  
  extension [Self <: TypeofvirtualFs](x: Self) {
    
    inline def setAliasHost(
      value: Instantiable1[
          /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
          AliasHost[js.Object]
        ]
    ): Self = StObject.set(x, "AliasHost", value.asInstanceOf[js.Any])
    
    inline def setCordHost(value: Instantiable1[/* _back */ ReadonlyHost[js.Object], CordHost]): Self = StObject.set(x, "CordHost", value.asInstanceOf[js.Any])
    
    inline def setCreateSyncHost(value: SyncHostHandler[Any] => Host[Any]): Self = StObject.set(x, "createSyncHost", js.Any.fromFunction1(value))
    
    inline def setEmpty(value: Instantiable0[Empty]): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
    
    inline def setFileBuffer(value: (TemplateStringsArray, /* repeated */ Any) => FileBuffer): Self = StObject.set(x, "fileBuffer", js.Any.fromFunction2(value))
    
    inline def setFileBufferToString(value: FileBuffer => String): Self = StObject.set(x, "fileBufferToString", js.Any.fromFunction1(value))
    
    inline def setPatternMatchingHost(
      value: Instantiable1[
          /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
          PatternMatchingHost[js.Object]
        ]
    ): Self = StObject.set(x, "PatternMatchingHost", value.asInstanceOf[js.Any])
    
    inline def setResolverHost(
      value: Instantiable1[
          /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
          ResolverHost[js.Object]
        ]
    ): Self = StObject.set(x, "ResolverHost", value.asInstanceOf[js.Any])
    
    inline def setSafeReadonlyHost(
      value: Instantiable1[
          /* _delegate */ ReadonlyHost[/* import warning: RewrittenClass.unapply cls was tparam StatsT */ Any], 
          SafeReadonlyHost[js.Object]
        ]
    ): Self = StObject.set(x, "SafeReadonlyHost", value.asInstanceOf[js.Any])
    
    inline def setScopedHost(
      value: Instantiable1[
          /* delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
          ScopedHost[js.Object]
        ]
    ): Self = StObject.set(x, "ScopedHost", value.asInstanceOf[js.Any])
    
    inline def setSimpleMemoryHost(value: Instantiable0[SimpleMemoryHost]): Self = StObject.set(x, "SimpleMemoryHost", value.asInstanceOf[js.Any])
    
    inline def setStringToFileBuffer(value: String => FileBuffer): Self = StObject.set(x, "stringToFileBuffer", js.Any.fromFunction1(value))
    
    inline def setSyncDelegateHost(
      value: Instantiable1[
          /* _delegate */ Host[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
          SyncDelegateHost[js.Object]
        ]
    ): Self = StObject.set(x, "SyncDelegateHost", value.asInstanceOf[js.Any])
    
    inline def setSynchronousDelegateExpectedException(value: Instantiable0[SynchronousDelegateExpectedException]): Self = StObject.set(x, "SynchronousDelegateExpectedException", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Typeoftest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
