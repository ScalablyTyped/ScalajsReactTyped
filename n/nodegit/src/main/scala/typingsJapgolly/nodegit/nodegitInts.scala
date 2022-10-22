package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.applyMod.Apply.LOCATION
import typingsJapgolly.nodegit.attrMod.Attr.STATES
import typingsJapgolly.nodegit.branchMod.Branch.BRANCH
import typingsJapgolly.nodegit.certMod.Cert.SSH
import typingsJapgolly.nodegit.checkoutMod.Checkout.NOTIFY
import typingsJapgolly.nodegit.checkoutMod.Checkout.STRATEGY
import typingsJapgolly.nodegit.cloneMod.Clone.LOCAL
import typingsJapgolly.nodegit.configMod.Config.LEVEL
import typingsJapgolly.nodegit.configMod.Config.MAP
import typingsJapgolly.nodegit.diffBinaryMod.DiffBinary.DIFF_BINARY
import typingsJapgolly.nodegit.diffMod.Diff.DELTA
import typingsJapgolly.nodegit.diffMod.Diff.FIND
import typingsJapgolly.nodegit.diffMod.Diff.FORMAT
import typingsJapgolly.nodegit.diffMod.Diff.FORMAT_EMAIL_FLAGS
import typingsJapgolly.nodegit.diffMod.Diff.LINE
import typingsJapgolly.nodegit.diffMod.Diff.STATS_FORMAT
import typingsJapgolly.nodegit.enumsMod.Enums.CVAR
import typingsJapgolly.nodegit.enumsMod.Enums.DIRECTION
import typingsJapgolly.nodegit.enumsMod.Enums.FEATURE
import typingsJapgolly.nodegit.enumsMod.Enums.IDXENTRY_EXTENDED_FLAG
import typingsJapgolly.nodegit.enumsMod.Enums.INDXENTRY_FLAG
import typingsJapgolly.nodegit.errorMod.Error.CODE
import typingsJapgolly.nodegit.errorMod.Error.ERROR
import typingsJapgolly.nodegit.fetchMod.Fetch.PRUNE
import typingsJapgolly.nodegit.filterMod.Filter.FLAG
import typingsJapgolly.nodegit.filterMod.Filter.MODE
import typingsJapgolly.nodegit.hashSigMod.Hashsig.OPTION
import typingsJapgolly.nodegit.indexMod.Index.ADD_OPTION
import typingsJapgolly.nodegit.indexMod.Index.CAP
import typingsJapgolly.nodegit.libGit2Mod.Libgit2.OPT
import typingsJapgolly.nodegit.mergeMod.Merge.ANALYSIS
import typingsJapgolly.nodegit.mergeMod.Merge.FILE_FAVOR
import typingsJapgolly.nodegit.mergeMod.Merge.FILE_FLAGS
import typingsJapgolly.nodegit.mergeMod.Merge.PREFERENCE
import typingsJapgolly.nodegit.objectMod.Object.TYPE
import typingsJapgolly.nodegit.odbMod.Odb.STREAM
import typingsJapgolly.nodegit.packBuilderMod.Packbuilder.STAGE
import typingsJapgolly.nodegit.rebaseOperationMod.RebaseOperation.REBASE_OPERATION
import typingsJapgolly.nodegit.referenceMod.Reference.NORMALIZE
import typingsJapgolly.nodegit.remoteMod.Remote.AUTOTAG_OPTION
import typingsJapgolly.nodegit.remoteMod.Remote.COMPLETION_TYPE
import typingsJapgolly.nodegit.revWalkMod.Revwalk.SORT
import typingsJapgolly.nodegit.stashMod.Stash.APPLY_FLAGS
import typingsJapgolly.nodegit.stashMod.Stash.APPLY_PROGRESS
import typingsJapgolly.nodegit.stashMod.Stash.FLAGS
import typingsJapgolly.nodegit.statusMod.Status.SHOW
import typingsJapgolly.nodegit.statusMod.Status.STATUS
import typingsJapgolly.nodegit.submoduleMod.Submodule.IGNORE
import typingsJapgolly.nodegit.submoduleMod.Submodule.RECURSE
import typingsJapgolly.nodegit.submoduleMod.Submodule.UPDATE
import typingsJapgolly.nodegit.treeEntryMod.TreeEntry.FILEMODE
import typingsJapgolly.nodegit.treeMod.Tree.WALK_MODE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodegitInts {
  
  @js.native
  sealed trait `-1`
    extends StObject
       with CAP
       with CODE
       with IGNORE
       with LEVEL
       with TYPE
  inline def `-1`: `-1` = -1.asInstanceOf[`-1`]
  
  @js.native
  sealed trait `-10`
    extends StObject
       with CODE
  inline def `-10`: `-10` = -10.asInstanceOf[`-10`]
  
  @js.native
  sealed trait `-11`
    extends StObject
       with CODE
  inline def `-11`: `-11` = -11.asInstanceOf[`-11`]
  
  @js.native
  sealed trait `-12`
    extends StObject
       with CODE
  inline def `-12`: `-12` = -12.asInstanceOf[`-12`]
  
  @js.native
  sealed trait `-13`
    extends StObject
       with CODE
  inline def `-13`: `-13` = -13.asInstanceOf[`-13`]
  
  @js.native
  sealed trait `-14`
    extends StObject
       with CODE
  inline def `-14`: `-14` = -14.asInstanceOf[`-14`]
  
  @js.native
  sealed trait `-15`
    extends StObject
       with CODE
  inline def `-15`: `-15` = -15.asInstanceOf[`-15`]
  
  @js.native
  sealed trait `-16`
    extends StObject
       with CODE
  inline def `-16`: `-16` = -16.asInstanceOf[`-16`]
  
  @js.native
  sealed trait `-17`
    extends StObject
       with CODE
  inline def `-17`: `-17` = -17.asInstanceOf[`-17`]
  
  @js.native
  sealed trait `-18`
    extends StObject
       with CODE
  inline def `-18`: `-18` = -18.asInstanceOf[`-18`]
  
  @js.native
  sealed trait `-19`
    extends StObject
       with CODE
  inline def `-19`: `-19` = -19.asInstanceOf[`-19`]
  
  @js.native
  sealed trait `-2`
    extends StObject
       with TYPE
  inline def `-2`: `-2` = -2.asInstanceOf[`-2`]
  
  @js.native
  sealed trait `-20`
    extends StObject
       with CODE
  inline def `-20`: `-20` = -20.asInstanceOf[`-20`]
  
  @js.native
  sealed trait `-21`
    extends StObject
       with CODE
  inline def `-21`: `-21` = -21.asInstanceOf[`-21`]
  
  @js.native
  sealed trait `-22`
    extends StObject
       with CODE
  inline def `-22`: `-22` = -22.asInstanceOf[`-22`]
  
  @js.native
  sealed trait `-23`
    extends StObject
       with CODE
  inline def `-23`: `-23` = -23.asInstanceOf[`-23`]
  
  @js.native
  sealed trait `-3`
    extends StObject
       with CODE
  inline def `-3`: `-3` = -3.asInstanceOf[`-3`]
  
  @js.native
  sealed trait `-30`
    extends StObject
       with CODE
  inline def `-30`: `-30` = -30.asInstanceOf[`-30`]
  
  @js.native
  sealed trait `-31`
    extends StObject
       with CODE
  inline def `-31`: `-31` = -31.asInstanceOf[`-31`]
  
  @js.native
  sealed trait `-4`
    extends StObject
       with CODE
  inline def `-4`: `-4` = -4.asInstanceOf[`-4`]
  
  @js.native
  sealed trait `-5`
    extends StObject
       with CODE
  inline def `-5`: `-5` = -5.asInstanceOf[`-5`]
  
  @js.native
  sealed trait `-6`
    extends StObject
       with CODE
  inline def `-6`: `-6` = -6.asInstanceOf[`-6`]
  
  @js.native
  sealed trait `-7`
    extends StObject
       with CODE
  inline def `-7`: `-7` = -7.asInstanceOf[`-7`]
  
  @js.native
  sealed trait `-8`
    extends StObject
       with CODE
  inline def `-8`: `-8` = -8.asInstanceOf[`-8`]
  
  @js.native
  sealed trait `-9`
    extends StObject
       with CODE
  inline def `-9`: `-9` = -9.asInstanceOf[`-9`]
  
  @js.native
  sealed trait `0`
    extends StObject
       with ADD_OPTION
       with ANALYSIS
       with APPLY_FLAGS
       with APPLY_PROGRESS
       with AUTOTAG_OPTION
       with CODE
       with COMPLETION_TYPE
       with CVAR
       with DELTA
       with DIFF_BINARY
       with DIRECTION
       with ERROR
       with FILEMODE
       with FILE_FAVOR
       with FILE_FLAGS
       with FIND
       with FLAG
       with typingsJapgolly.nodegit.pathSpecMod.Pathspec.FLAG
       with typingsJapgolly.nodegit.blameMod.Blame.FLAG
       with FLAGS
       with FORMAT_EMAIL_FLAGS
       with LOCAL
       with LOCATION
       with MAP
       with MODE
       with NORMALIZE
       with NOTIFY
       with OPT
       with OPTION
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with PREFERENCE
       with PRUNE
       with REBASE_OPERATION
       with RECURSE
       with SHOW
       with SORT
       with STAGE
       with STATES
       with STATS_FORMAT
       with STATUS
       with STRATEGY
       with TYPE
       with typingsJapgolly.nodegit.referenceMod.Reference.TYPE
       with typingsJapgolly.nodegit.certMod.Cert.TYPE
       with UPDATE
       with WALK_MODE
  inline def `0`: `0` = 0.asInstanceOf[`0`]
  
  @js.native
  sealed trait `1`
    extends StObject
       with ADD_OPTION
       with ANALYSIS
       with APPLY_FLAGS
       with APPLY_PROGRESS
       with AUTOTAG_OPTION
       with BRANCH
       with CAP
       with COMPLETION_TYPE
       with CVAR
       with DELTA
       with DIFF_BINARY
       with DIRECTION
       with ERROR
       with FEATURE
       with FILE_FAVOR
       with FILE_FLAGS
       with FIND
       with FLAG
       with typingsJapgolly.nodegit.pathSpecMod.Pathspec.FLAG
       with typingsJapgolly.nodegit.diffMod.Diff.FLAG
       with typingsJapgolly.nodegit.blameMod.Blame.FLAG
       with FLAGS
       with FORMAT
       with FORMAT_EMAIL_FLAGS
       with IDXENTRY_EXTENDED_FLAG
       with IGNORE
       with LEVEL
       with LOCAL
       with LOCATION
       with MAP
       with MODE
       with typingsJapgolly.nodegit.revParseMod.Revparse.MODE
       with NORMALIZE
       with NOTIFY
       with OPT
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with OPTION
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with PREFERENCE
       with typingsJapgolly.nodegit.worktreeMod.Worktree.PRUNE
       with PRUNE
       with REBASE_OPERATION
       with RECURSE
       with SHOW
       with SORT
       with SSH
       with STAGE
       with STATES
       with STATS_FORMAT
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
       with TYPE
       with typingsJapgolly.nodegit.referenceMod.Reference.TYPE
       with typingsJapgolly.nodegit.certMod.Cert.TYPE
       with typingsJapgolly.nodegit.resetMod.Reset.TYPE
       with typingsJapgolly.nodegit.credMod.Cred.TYPE
       with UPDATE
       with WALK_MODE
  inline def `1`: `1` = 1.asInstanceOf[`1`]
  
  @js.native
  sealed trait `10`
    extends StObject
       with DELTA
       with ERROR
       with OPT
  inline def `10`: `10` = 10.asInstanceOf[`10`]
  
  @js.native
  sealed trait `1024`
    extends StObject
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
  inline def `1024`: `1024` = 1024.asInstanceOf[`1024`]
  
  @js.native
  sealed trait `1048576`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STRATEGY
  inline def `1048576`: `1048576` = 1048576.asInstanceOf[`1048576`]
  
  @js.native
  sealed trait `1073741824`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
  inline def `1073741824`: `1073741824` = 1073741824.asInstanceOf[`1073741824`]
  
  @js.native
  sealed trait `11`
    extends StObject
       with ERROR
       with OPT
  inline def `11`: `11` = 11.asInstanceOf[`11`]
  
  @js.native
  sealed trait `12`
    extends StObject
       with ERROR
       with OPT
  inline def `12`: `12` = 12.asInstanceOf[`12`]
  
  @js.native
  sealed trait `128`
    extends StObject
       with FILE_FLAGS
       with IDXENTRY_EXTENDED_FLAG
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
  inline def `128`: `128` = 128.asInstanceOf[`128`]
  
  @js.native
  sealed trait `13`
    extends StObject
       with ERROR
  inline def `13`: `13` = 13.asInstanceOf[`13`]
  
  @js.native
  sealed trait `131072`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STRATEGY
  inline def `131072`: `131072` = 131072.asInstanceOf[`131072`]
  
  @js.native
  sealed trait `14`
    extends StObject
       with ERROR
  inline def `14`: `14` = 14.asInstanceOf[`14`]
  
  @js.native
  sealed trait `15`
    extends StObject
       with ERROR
  inline def `15`: `15` = 15.asInstanceOf[`15`]
  
  @js.native
  sealed trait `16`
    extends StObject
       with ERROR
       with FILE_FLAGS
       with FIND
       with typingsJapgolly.nodegit.pathSpecMod.Pathspec.FLAG
       with typingsJapgolly.nodegit.blameMod.Blame.FLAG
       with IDXENTRY_EXTENDED_FLAG
       with NOTIFY
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
       with typingsJapgolly.nodegit.credMod.Cred.TYPE
  inline def `16`: `16` = 16.asInstanceOf[`16`]
  
  @js.native
  sealed trait `16384`
    extends StObject
       with FILEMODE
       with FIND
       with IDXENTRY_EXTENDED_FLAG
       with INDXENTRY_FLAG
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STATUS
  inline def `16384`: `16384` = 16384.asInstanceOf[`16384`]
  
  @js.native
  sealed trait `16777216`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
  inline def `16777216`: `16777216` = 16777216.asInstanceOf[`16777216`]
  
  @js.native
  sealed trait `17`
    extends StObject
       with ERROR
  inline def `17`: `17` = 17.asInstanceOf[`17`]
  
  @js.native
  sealed trait `18`
    extends StObject
       with ERROR
  inline def `18`: `18` = 18.asInstanceOf[`18`]
  
  @js.native
  sealed trait `19`
    extends StObject
       with ERROR
  inline def `19`: `19` = 19.asInstanceOf[`19`]
  
  @js.native
  sealed trait `2`
    extends StObject
       with ADD_OPTION
       with ANALYSIS
       with APPLY_PROGRESS
       with AUTOTAG_OPTION
       with BRANCH
       with CAP
       with COMPLETION_TYPE
       with CVAR
       with DELTA
       with DIFF_BINARY
       with ERROR
       with FEATURE
       with FILE_FAVOR
       with FILE_FLAGS
       with FIND
       with typingsJapgolly.nodegit.pathSpecMod.Pathspec.FLAG
       with typingsJapgolly.nodegit.diffMod.Diff.FLAG
       with typingsJapgolly.nodegit.blameMod.Blame.FLAG
       with FLAGS
       with FORMAT
       with IDXENTRY_EXTENDED_FLAG
       with IGNORE
       with LEVEL
       with LOCAL
       with LOCATION
       with MAP
       with typingsJapgolly.nodegit.revParseMod.Revparse.MODE
       with NORMALIZE
       with NOTIFY
       with OPT
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with OPTION
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with PREFERENCE
       with typingsJapgolly.nodegit.worktreeMod.Worktree.PRUNE
       with PRUNE
       with REBASE_OPERATION
       with RECURSE
       with SHOW
       with SORT
       with SSH
       with STATES
       with STATS_FORMAT
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
       with STREAM
       with TYPE
       with typingsJapgolly.nodegit.referenceMod.Reference.TYPE
       with typingsJapgolly.nodegit.certMod.Cert.TYPE
       with typingsJapgolly.nodegit.resetMod.Reset.TYPE
       with typingsJapgolly.nodegit.credMod.Cred.TYPE
       with UPDATE
  inline def `2`: `2` = 2.asInstanceOf[`2`]
  
  @js.native
  sealed trait `20`
    extends StObject
       with ERROR
  inline def `20`: `20` = 20.asInstanceOf[`20`]
  
  @js.native
  sealed trait `2048`
    extends StObject
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
  inline def `2048`: `2048` = 2048.asInstanceOf[`2048`]
  
  @js.native
  sealed trait `2097152`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STRATEGY
  inline def `2097152`: `2097152` = 2097152.asInstanceOf[`2097152`]
  
  @js.native
  sealed trait `21`
    extends StObject
       with ERROR
  inline def `21`: `21` = 21.asInstanceOf[`21`]
  
  @js.native
  sealed trait `22`
    extends StObject
       with ERROR
  inline def `22`: `22` = 22.asInstanceOf[`22`]
  
  @js.native
  sealed trait `23`
    extends StObject
       with ERROR
  inline def `23`: `23` = 23.asInstanceOf[`23`]
  
  @js.native
  sealed trait `24`
    extends StObject
       with ERROR
  inline def `24`: `24` = 24.asInstanceOf[`24`]
  
  @js.native
  sealed trait `24576`
    extends StObject
       with IDXENTRY_EXTENDED_FLAG
  inline def `24576`: `24576` = 24576.asInstanceOf[`24576`]
  
  @js.native
  sealed trait `25`
    extends StObject
       with ERROR
  inline def `25`: `25` = 25.asInstanceOf[`25`]
  
  @js.native
  sealed trait `255`
    extends StObject
       with FIND
  inline def `255`: `255` = 255.asInstanceOf[`255`]
  
  @js.native
  sealed trait `256`
    extends StObject
       with IDXENTRY_EXTENDED_FLAG
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
  inline def `256`: `256` = 256.asInstanceOf[`256`]
  
  @js.native
  sealed trait `26`
    extends StObject
       with ERROR
  inline def `26`: `26` = 26.asInstanceOf[`26`]
  
  @js.native
  sealed trait `262144`
    extends StObject
       with STRATEGY
  inline def `262144`: `262144` = 262144.asInstanceOf[`262144`]
  
  @js.native
  sealed trait `268435456`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
  inline def `268435456`: `268435456` = 268435456.asInstanceOf[`268435456`]
  
  @js.native
  sealed trait `27`
    extends StObject
       with ERROR
  inline def `27`: `27` = 27.asInstanceOf[`27`]
  
  @js.native
  sealed trait `28`
    extends StObject
       with ERROR
  inline def `28`: `28` = 28.asInstanceOf[`28`]
  
  @js.native
  sealed trait `29`
    extends StObject
       with ERROR
  inline def `29`: `29` = 29.asInstanceOf[`29`]
  
  @js.native
  sealed trait `3`
    extends StObject
       with APPLY_PROGRESS
       with AUTOTAG_OPTION
       with BRANCH
       with CVAR
       with DELTA
       with ERROR
       with FILE_FAVOR
       with FORMAT
       with IGNORE
       with LEVEL
       with LOCAL
       with MAP
       with OPT
       with REBASE_OPERATION
       with STATES
       with TYPE
       with typingsJapgolly.nodegit.referenceMod.Reference.TYPE
       with typingsJapgolly.nodegit.certMod.Cert.TYPE
       with typingsJapgolly.nodegit.resetMod.Reset.TYPE
       with UPDATE
  inline def `3`: `3` = 3.asInstanceOf[`3`]
  
  @js.native
  sealed trait `30`
    extends StObject
       with ERROR
  inline def `30`: `30` = 30.asInstanceOf[`30`]
  
  @js.native
  sealed trait `32`
    extends StObject
       with FILE_FLAGS
       with FIND
       with typingsJapgolly.nodegit.pathSpecMod.Pathspec.FLAG
       with IDXENTRY_EXTENDED_FLAG
       with LINE
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STRATEGY
       with typingsJapgolly.nodegit.credMod.Cred.TYPE
  inline def `32`: `32` = 32.asInstanceOf[`32`]
  
  @js.native
  sealed trait `32768`
    extends StObject
       with FIND
       with IDXENTRY_EXTENDED_FLAG
       with INDXENTRY_FLAG
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STATUS
  inline def `32768`: `32768` = 32768.asInstanceOf[`32768`]
  
  @js.native
  sealed trait `33188`
    extends StObject
       with FILEMODE
  inline def `33188`: `33188` = 33188.asInstanceOf[`33188`]
  
  @js.native
  sealed trait `33261`
    extends StObject
       with FILEMODE
  inline def `33261`: `33261` = 33261.asInstanceOf[`33261`]
  
  @js.native
  sealed trait `33554432`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
  inline def `33554432`: `33554432` = 33554432.asInstanceOf[`33554432`]
  
  @js.native
  sealed trait `4`
    extends StObject
       with ADD_OPTION
       with ANALYSIS
       with APPLY_PROGRESS
       with CAP
       with DELTA
       with ERROR
       with FEATURE
       with FILE_FLAGS
       with FIND
       with typingsJapgolly.nodegit.pathSpecMod.Pathspec.FLAG
       with typingsJapgolly.nodegit.diffMod.Diff.FLAG
       with typingsJapgolly.nodegit.blameMod.Blame.FLAG
       with FLAGS
       with FORMAT
       with IDXENTRY_EXTENDED_FLAG
       with IGNORE
       with LEVEL
       with typingsJapgolly.nodegit.revParseMod.Revparse.MODE
       with NORMALIZE
       with NOTIFY
       with OPT
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with OPTION
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.worktreeMod.Worktree.PRUNE
       with REBASE_OPERATION
       with SORT
       with STATS_FORMAT
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
       with STREAM
       with TYPE
       with typingsJapgolly.nodegit.credMod.Cred.TYPE
       with UPDATE
  inline def `4`: `4` = 4.asInstanceOf[`4`]
  
  @js.native
  sealed trait `4096`
    extends StObject
       with FIND
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
  inline def `4096`: `4096` = 4096.asInstanceOf[`4096`]
  
  @js.native
  sealed trait `40960`
    extends StObject
       with FILEMODE
  inline def `40960`: `40960` = 40960.asInstanceOf[`40960`]
  
  @js.native
  sealed trait `4194304`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STRATEGY
  inline def `4194304`: `4194304` = 4194304.asInstanceOf[`4194304`]
  
  @js.native
  sealed trait `43`
    extends StObject
       with LINE
  inline def `43`: `43` = 43.asInstanceOf[`43`]
  
  @js.native
  sealed trait `45`
    extends StObject
       with LINE
  inline def `45`: `45` = 45.asInstanceOf[`45`]
  
  @js.native
  sealed trait `48`
    extends StObject
       with FIND
  inline def `48`: `48` = 48.asInstanceOf[`48`]
  
  @js.native
  sealed trait `5`
    extends StObject
       with APPLY_PROGRESS
       with DELTA
       with ERROR
       with FORMAT
       with LEVEL
       with OPT
       with REBASE_OPERATION
       with TYPE
  inline def `5`: `5` = 5.asInstanceOf[`5`]
  
  @js.native
  sealed trait `512`
    extends StObject
       with IDXENTRY_EXTENDED_FLAG
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with STRATEGY
  inline def `512`: `512` = 512.asInstanceOf[`512`]
  
  @js.native
  sealed trait `524288`
    extends StObject
       with STRATEGY
  inline def `524288`: `524288` = 524288.asInstanceOf[`524288`]
  
  @js.native
  sealed trait `536870912`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
  inline def `536870912`: `536870912` = 536870912.asInstanceOf[`536870912`]
  
  @js.native
  sealed trait `57344`
    extends StObject
       with FILEMODE
  inline def `57344`: `57344` = 57344.asInstanceOf[`57344`]
  
  @js.native
  sealed trait `6`
    extends StObject
       with APPLY_PROGRESS
       with DELTA
       with ERROR
       with OPT
       with STREAM
       with TYPE
  inline def `6`: `6` = 6.asInstanceOf[`6`]
  
  @js.native
  sealed trait `60`
    extends StObject
       with LINE
  inline def `60`: `60` = 60.asInstanceOf[`60`]
  
  @js.native
  sealed trait `61`
    extends StObject
       with LINE
  inline def `61`: `61` = 61.asInstanceOf[`61`]
  
  @js.native
  sealed trait `62`
    extends StObject
       with LINE
  inline def `62`: `62` = 62.asInstanceOf[`62`]
  
  @js.native
  sealed trait `64`
    extends StObject
       with FILE_FLAGS
       with FIND
       with IDXENTRY_EXTENDED_FLAG
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STRATEGY
       with typingsJapgolly.nodegit.credMod.Cred.TYPE
  inline def `64`: `64` = 64.asInstanceOf[`64`]
  
  @js.native
  sealed trait `65535`
    extends StObject
       with NOTIFY
  inline def `65535`: `65535` = 65535.asInstanceOf[`65535`]
  
  @js.native
  sealed trait `65536`
    extends StObject
       with FIND
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STRATEGY
  inline def `65536`: `65536` = 65536.asInstanceOf[`65536`]
  
  @js.native
  sealed trait `66`
    extends StObject
       with LINE
  inline def `66`: `66` = 66.asInstanceOf[`66`]
  
  @js.native
  sealed trait `67108864`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
  inline def `67108864`: `67108864` = 67108864.asInstanceOf[`67108864`]
  
  @js.native
  sealed trait `7`
    extends StObject
       with APPLY_PROGRESS
       with DELTA
       with ERROR
       with OPT
       with TYPE
  inline def `7`: `7` = 7.asInstanceOf[`7`]
  
  @js.native
  sealed trait `70`
    extends StObject
       with LINE
  inline def `70`: `70` = 70.asInstanceOf[`70`]
  
  @js.native
  sealed trait `72`
    extends StObject
       with LINE
  inline def `72`: `72` = 72.asInstanceOf[`72`]
  
  @js.native
  sealed trait `8`
    extends StObject
       with ANALYSIS
       with DELTA
       with ERROR
       with FILE_FLAGS
       with FIND
       with typingsJapgolly.nodegit.pathSpecMod.Pathspec.FLAG
       with typingsJapgolly.nodegit.diffMod.Diff.FLAG
       with typingsJapgolly.nodegit.blameMod.Blame.FLAG
       with IDXENTRY_EXTENDED_FLAG
       with NOTIFY
       with OPT
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STATS_FORMAT
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STATUS
       with typingsJapgolly.nodegit.credMod.Cred.TYPE
  inline def `8`: `8` = 8.asInstanceOf[`8`]
  
  @js.native
  sealed trait `8192`
    extends StObject
       with FIND
       with IDXENTRY_EXTENDED_FLAG
       with typingsJapgolly.nodegit.statusMod.Status.OPT
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with typingsJapgolly.nodegit.submoduleMod.Submodule.STATUS
       with STRATEGY
  inline def `8192`: `8192` = 8192.asInstanceOf[`8192`]
  
  @js.native
  sealed trait `8388608`
    extends StObject
       with typingsJapgolly.nodegit.diffMod.Diff.OPTION
       with STRATEGY
  inline def `8388608`: `8388608` = 8388608.asInstanceOf[`8388608`]
  
  @js.native
  sealed trait `9`
    extends StObject
       with DELTA
       with ERROR
       with OPT
  inline def `9`: `9` = 9.asInstanceOf[`9`]
}
